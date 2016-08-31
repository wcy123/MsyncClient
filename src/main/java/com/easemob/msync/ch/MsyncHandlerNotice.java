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
public class MsyncHandlerNotice extends SimpleChannelInboundHandler<Msync.CommNotice> {
    final private Client client;

    public MsyncHandlerNotice(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Msync.CommNotice msg) throws Exception {
        if (msg.hasQueue()) {
            final Jid.JID queue = msg.getQueue();
            startSync(queue, ctx.channel());
        }
    }

    private void startSync(Jid.JID queue, Channel channel) throws InterruptedException {
        Thread.sleep(10000);
        if(client.isLocked(queue)) {
            log.debug("already in sync mode for {} ", queue);
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
