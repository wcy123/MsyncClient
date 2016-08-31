package com.easemob.msync.ch;

import com.easemob.msync.Client;

import easemob.pb.Messagebody;
import easemob.pb.Mucbody;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16. handle msync meta
 * handle Mucbody.MUCBody
 */
@Slf4j
public class MsyncHandlerSyncMetaConference extends SimpleChannelInboundHandler<Mucbody.MUCBody> {
    final private Client client;

    public MsyncHandlerSyncMetaConference(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Mucbody.MUCBody msg) throws Exception {

    }
}
