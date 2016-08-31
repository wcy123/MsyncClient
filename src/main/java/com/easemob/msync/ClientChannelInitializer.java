package com.easemob.msync;

import com.easemob.msync.ch.MsyncHandlerNotice;
import com.easemob.msync.ch.MsyncHandlerProvision;
import com.easemob.msync.ch.MsyncHandlerSync;
import com.easemob.msync.ch.MsyncHandlerSyncMeta;
import com.easemob.msync.ch.MsyncHandlerSyncMetaChat;
import com.easemob.msync.ch.MsyncHandlerSyncMetaConference;
import com.easemob.msync.ch.MsyncHandlerSyncMetaMuc;
import com.easemob.msync.ch.MsyncHandlerSyncMetaRoster;
import com.easemob.msync.ch.MsyncHandlerSyncMetaStatistic;
import com.easemob.msync.ch.MsyncHandlerUnread;
import com.easemob.msync.codec.MsyncCmdDecoder;
import com.easemob.msync.codec.MsyncCmdEncoder;
import com.easemob.msync.codec.ProtobufDecoder;
import com.easemob.msync.codec.ProtobufEncoder;

import java.nio.ByteOrder;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * Created by wangchunye on 8/29/16.
 * clients manager
 */
class ClientChannelInitializer extends ChannelInitializer<SocketChannel> {

    private static final int N_THREADS = 10;
    final private Client client;

    ClientChannelInitializer(Client client) {
        this.client = client;
    }


    @Override
    public void initChannel(SocketChannel ch) throws Exception {
        final ChannelPipeline pipeline = ch.pipeline();
        final EventExecutorGroup eg = new DefaultEventExecutorGroup(N_THREADS);

        /* framer */
        pipeline.addLast(
                eg,
                "frameDecoder",
                new LengthFieldBasedFrameDecoder(
                        ByteOrder.BIG_ENDIAN, // ByteOrder byteOrder,
                        1048576*10, // int maxFrameLength, 10M
                        0, // int lengthFieldOffset,
                        4, // int lengthFieldLength,
                        0, // int lengthAdjustment,
                        4, // int initialBytesToStrip,
                        true// boolean failFast)
                ));
        pipeline.addLast(
                eg,
                "frameEncoder",
                new LengthFieldPrepender(4));

        /* MSync level encoder/decoder */
        pipeline.addLast("protobufEncoder", new ProtobufEncoder());
        pipeline.addLast("protobufDecoder", new ProtobufDecoder());
        pipeline.addLast("logger1", new LoggingHandler(LogLevel.DEBUG));

        /* command level encoder/decoder */
        pipeline.addLast("metaDecoder", new MsyncCmdDecoder());
        pipeline.addLast("metaEncoder", new MsyncCmdEncoder(client));
        pipeline.addLast("logger2", new LoggingHandler(LogLevel.DEBUG));

        /* logic handler */
        pipeline.addLast("provisonHandler", new MsyncHandlerProvision(client));
        pipeline.addLast("getUnreadHandler", new MsyncHandlerUnread(client));
        pipeline.addLast("syncHandler", new MsyncHandlerSync(client));
        pipeline.addLast("noticeHandler", new MsyncHandlerNotice(client));
        pipeline.addLast("sync", new MsyncHandlerSync(client));
        pipeline.addLast("sync.meta", new MsyncHandlerSyncMeta(client));
        pipeline.addLast("sync.meta.chat", new MsyncHandlerSyncMetaChat(client));
        pipeline.addLast("sync.meta.muc", new MsyncHandlerSyncMetaMuc(client));
        pipeline.addLast("sync.meta.roster", new MsyncHandlerSyncMetaRoster(client));
        pipeline.addLast("sync.meta.conference", new MsyncHandlerSyncMetaConference(client));
        pipeline.addLast("sync.meta.statistics", new MsyncHandlerSyncMetaStatistic(client));

    }
}
