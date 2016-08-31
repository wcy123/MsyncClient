package com.easemob.msync.codec;

import com.google.protobuf.MessageLiteOrBuilder;

import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16.
 * handle protobuffer
 */
@Slf4j
public class ProtobufEncoder extends io.netty.handler.codec.protobuf.ProtobufEncoder {
    @Override
    protected void encode(ChannelHandlerContext ctx, MessageLiteOrBuilder msg, List<Object> out) throws Exception {
        super.encode(ctx, msg, out);
        log.debug("send MSYNC: {} ", msg);
    }
}
