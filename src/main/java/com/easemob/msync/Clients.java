package com.easemob.msync;

import com.easemob.msync.listeners.LoginOnConnected;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/29/16.
 */
@Slf4j
public class Clients  {
    static public EventLoopGroup workerGroup = new NioEventLoopGroup(1);

    public static ChannelFuture startClient(DummyClientListener clientListener, ClientData clientData, String Host, int Port)
            throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap()
                .group(workerGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true);
        // Start the client.
        Client client = new Client(clientData, clientListener);
        bootstrap.handler(new ClientChannelInitializer(client));
        ChannelFuture f = bootstrap.connect(Host, Port);
        f.addListener(new LoginOnConnected(client));
        client.setChannel(f.channel());
        return f;
    }

    static public class Heartbeat implements Runnable {
        public void run() {
            log.debug("alive");
        }
    }
}
