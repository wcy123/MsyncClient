package com.easemob.msync.ch;

import com.easemob.msync.Client;

import easemob.pb.Messagebody;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16. handle msync meta
 * handle Messagebody.MessageBody
 */
@Slf4j
public class MsyncHandlerSyncMetaChat extends SimpleChannelInboundHandler<Messagebody.MessageBody> {
    final private Client client;

    public MsyncHandlerSyncMetaChat(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Messagebody.MessageBody msg) throws Exception {
        log.debug("{}: recv {}", client.getFullName(), msg);
        client.fireReadMeta(msg);
    }
}
