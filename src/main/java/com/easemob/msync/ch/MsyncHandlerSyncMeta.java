package com.easemob.msync.ch;

import com.easemob.msync.Client;

import easemob.pb.Conferencebody;
import easemob.pb.Messagebody;
import easemob.pb.Msync;
import easemob.pb.Mucbody;
import easemob.pb.Rosterbody;
import easemob.pb.Statisticsbody;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16. handle msync meta
 * Meta namespace dispatcher.
 */
@Slf4j
public class MsyncHandlerSyncMeta extends SimpleChannelInboundHandler<Msync.Meta> {
    final private Client client;

    public MsyncHandlerSyncMeta(Client client) {
        this.client = client;
    }

    protected void channelRead0(ChannelHandlerContext ctx, Msync.Meta msg) throws Exception {
        if (!msg.hasNs()) {
            log.error("{}: receive a meta, but no namespace. meta = {}", client.getFullName(),
                    msg);
            return;
        }
        switch (msg.getNs()) {
            case STATISTIC:
                ctx.fireChannelRead(Statisticsbody.StatisticsBody.parseFrom(msg.getPayload()));
                break;
            case CHAT:
                ctx.fireChannelRead(Messagebody.MessageBody.parseFrom(msg.getPayload()));
                break;
            case MUC:
                ctx.fireChannelRead(Mucbody.MUCBody.parseFrom(msg.getPayload()));
                break;
            case ROSTER:
                ctx.fireChannelRead(Rosterbody.RosterBody.parseFrom(msg.getPayload()));
                break;
            case CONFERENCE:
                ctx.fireChannelRead(Conferencebody.ConferenceBody.parseFrom(msg.getPayload()));
                break;
            default:
                throw new ClassCastException(msg.getNs().toString());
        }
        return;
    }
}
