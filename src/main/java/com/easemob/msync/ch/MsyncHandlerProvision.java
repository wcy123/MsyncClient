package com.easemob.msync.ch;

import com.easemob.msync.Client;

import java.util.concurrent.TimeUnit;

import easemob.pb.Msync;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16.
 * handle provision meta, whether login fail or not.
 */
@Slf4j
public class MsyncHandlerProvision extends SimpleChannelInboundHandler<Msync.Provision> {
    final private Client client;

    public MsyncHandlerProvision(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Msync.Provision msg) throws Exception {
        // login ok, so schedule out get_unread;
        if(msg.hasStatus() && msg.getStatus().getErrorCode() == Msync.Status.ErrorCode.OK){
            log.debug("LOGIN OK: {}", msg);
            client.getChannel().eventLoop().scheduleAtFixedRate(new GetUnreadHeartBeat(), 0, 10, TimeUnit.SECONDS);
        }else {
            log.debug("LOGIN FAIL: {}", msg);
            client.getChannel().close();
        }
    }

    private class GetUnreadHeartBeat implements Runnable {
        public void run() {
            client.writeAndFlush(Msync.CommUnreadUL.newBuilder().build());
        }
    }
}
