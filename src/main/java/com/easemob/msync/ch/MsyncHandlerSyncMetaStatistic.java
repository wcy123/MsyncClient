package com.easemob.msync.ch;

import com.easemob.msync.Client;

import easemob.pb.Messagebody;
import easemob.pb.Rosterbody;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16. handle msync meta
 * handle Rosterbody.RosterBody
 */
@Slf4j
public class MsyncHandlerSyncMetaStatistic extends SimpleChannelInboundHandler<Rosterbody.RosterBody> {
    final private Client client;

    public MsyncHandlerSyncMetaStatistic(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Rosterbody.RosterBody msg) throws Exception {
    }
}
