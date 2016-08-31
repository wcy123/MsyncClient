package com.easemob.msync.codec;

import java.util.List;

import easemob.pb.Msync;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MsyncCmdDecoder extends MessageToMessageDecoder<Msync.MSync> {
    protected void decode(ChannelHandlerContext ctx, Msync.MSync msg, List<Object> out) throws Exception {
        switch(msg.getCommand()) {
            case PROVISION:
                out.add(Msync.Provision.parseFrom(msg.getPayload()));
                break;
            case UNREAD:
                out.add(Msync.CommUnreadDL.parseFrom(msg.getPayload()));
                break;
            case SYNC:
                out.add(Msync.CommSyncDL.parseFrom(msg.getPayload()));
                break;
            case NOTICE:
                out.add(Msync.CommNotice.parseFrom(msg.getPayload()));
                break;
            default:
                throw new ClassCastException(msg.getCommand().toString());
        }
    }
}
