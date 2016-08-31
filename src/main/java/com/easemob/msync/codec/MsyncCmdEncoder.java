package com.easemob.msync.codec;

import com.easemob.msync.Client;

import java.util.List;

import easemob.pb.Jid;
import easemob.pb.Msync;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MsyncCmdEncoder extends MessageToMessageEncoder<Object> {
    final private Client client;

    public MsyncCmdEncoder(Client client) {
        this.client = client;
    }

    protected void encode(ChannelHandlerContext ctx, Object msg, List<Object> out) throws Exception {
        final Msync.MSync msync;
        if (msg instanceof Msync.Provision) {
            msync = encodeProvison((Msync.Provision) msg);
        } else if (msg instanceof Msync.CommUnreadUL) {
            msync = encodeGetUnread((Msync.CommUnreadUL) msg);
        } else if (msg instanceof Msync.CommSyncUL) {
            msync = encodeSyncUL((Msync.CommSyncUL) msg);
        } else {
            throw new AssertionError("never goes here");
        }
        out.add(msync);
    }


    private Msync.MSync encodeProvison(Msync.Provision msg) {
        return Msync.MSync.newBuilder()
                .setCommand(Msync.MSync.Command.PROVISION)
                .setGuid(Jid.JID.newBuilder()
                        .setAppKey(client.getClientData().getAppkey())
                        .setDomain(client.getClientData().getDomain())
                        .setName(client.getClientData().getUser())
                        .setClientResource(client.getClientData().getResource())
                        .build())
                .setAuth(client.getClientData().getPassword())
                .setPayload(msg.toByteString())
                .build();
    }

    private Msync.MSync encodeGetUnread(Msync.CommUnreadUL msg) {
        return Msync.MSync.newBuilder()
                .setCommand(Msync.MSync.Command.UNREAD)
                .setPayload(msg.toByteString())
                .build();
    }

    private Msync.MSync encodeSyncUL(Msync.CommSyncUL msg) {
        return Msync.MSync.newBuilder()
                .setCommand(Msync.MSync.Command.SYNC)
                .setPayload(msg.toByteString())
                .build();
    }

    @Override
    public boolean acceptOutboundMessage(Object msg) throws Exception {
        return (msg instanceof Msync.Provision) ||
                (msg instanceof Msync.CommUnreadUL) ||
                (msg instanceof Msync.CommSyncUL);
    }
}
