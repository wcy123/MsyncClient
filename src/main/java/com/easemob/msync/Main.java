package com.easemob.msync;

import java.util.concurrent.TimeUnit;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.Slf4JLoggerFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16.
 */
@Slf4j
public class Main {
    static public void main(String args[]) throws InterruptedException {
        InternalLoggerFactory.setDefaultFactory(Slf4JLoggerFactory.INSTANCE);
        Clients.workerGroup.scheduleAtFixedRate(new Clients.Heartbeat(), 0, 1, TimeUnit.SECONDS);
        ClientData clientData = new ClientData();
        String host = "120.26.12.158";
        int port = 6717;
        Clients.startClient(new DummyClientListener(), clientData, host, port);
        ClientData clientData2 = new ClientData();
        clientData2.setUser("c7");
        Clients.startClient(new DummyClientListener(), clientData2, host, port);
    }
}
