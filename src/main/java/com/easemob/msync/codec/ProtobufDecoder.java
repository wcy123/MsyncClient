package com.easemob.msync.codec;


import java.util.List;

import easemob.pb.Msync;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16.
 * handle protobuffer
 */
@Slf4j
public class ProtobufDecoder extends io.netty.handler.codec.protobuf.ProtobufDecoder {
    public ProtobufDecoder() {
        super(Msync.MSync.getDefaultInstance());
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        super.decode(ctx, msg, out);
        log.debug("recv MSYNC: {}", out.get(0));
    }
}
