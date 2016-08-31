package com.easemob.msync.ch;

/**
 * Created by wangchunye on 8/30/16.
 * handle MSYNC GetUnread
 */

import com.easemob.msync.Client;


import easemob.pb.Jid;
import easemob.pb.Msync;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MsyncHandlerUnread extends SimpleChannelInboundHandler<Msync.CommUnreadDL> {
    final private Client client;

    public MsyncHandlerUnread(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Msync.CommUnreadDL msg) throws Exception {
        if (msg.hasStatus() && msg.getStatus().getErrorCode() == Msync.Status.ErrorCode.OK) {
            for (Msync.MetaQueue queue : msg.getUnreadList()) {
                log.debug("{}: unread queue: {} {} unread message(s)", client.getFullName(), queue.getQueue(), queue.getN());
                startSync(queue.getQueue(), ctx.channel());
            }
        }
    }

    private void startSync(Jid.JID queue, Channel channel) {
        if(client.isLocked(queue)) {
            log.warn("already in sync mode for {} ", queue);
            return;
        }
        client.lock(queue);
        channel.writeAndFlush(buildSync(queue));
    }

    private Msync.CommSyncUL buildSync(Jid.JID queue) {
        return Msync.CommSyncUL.newBuilder()
                .setQueue(queue)
                .build();
    }
}
