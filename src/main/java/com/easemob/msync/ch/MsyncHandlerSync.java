package com.easemob.msync.ch;

import com.easemob.msync.Client;

import easemob.pb.Jid;
import easemob.pb.Msync;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16. handle MSYNC SYNC command
 */
@Slf4j
public class MsyncHandlerSync extends SimpleChannelInboundHandler<Msync.CommSyncDL> {
    final private Client client;

    public MsyncHandlerSync(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Msync.CommSyncDL msg) throws Exception {
        if (msg.hasStatus() && msg.getStatus().getErrorCode() == Msync.Status.ErrorCode.OK &&
                msg.hasQueue()) {
            final Jid.JID queue = msg.getQueue();
            for (Msync.Meta meta : msg.getMetasList()) {
                ctx.fireChannelRead(meta);
            }
            maybeContinueSync(msg, queue);
        } else {
            log.error("{}: close on error {}", client.getFullName(), msg);
            client.close();
        }
    }

    private void maybeContinueSync(Msync.CommSyncDL msg, Jid.JID queue) {
        if (isLastSync(msg)) {
            client.unlock(queue);
        } else {
            continueSync(msg, queue);
        }
    }

    private void continueSync(Msync.CommSyncDL msg, Jid.JID queue) {
        if (!msg.hasNextKey()) {
            client.unlock(queue);
            return;
        }
        final long nextKey = msg.getNextKey();
        client.writeAndFlush(Msync.CommSyncUL.newBuilder()
                .setKey(nextKey)
                .setQueue(queue)
                .build());
    }

    private boolean isLastSync(Msync.CommSyncDL msg) {
        boolean isLast = msg.hasIsLast() && msg.getIsLast();
        boolean hasNoNext = !(msg.hasNextKey());
        return isLast || hasNoNext;
    }
}
