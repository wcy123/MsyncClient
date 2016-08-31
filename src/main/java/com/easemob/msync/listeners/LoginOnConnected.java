package com.easemob.msync.listeners;

import com.easemob.msync.Client;

import easemob.pb.Msync;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import lombok.extern.slf4j.Slf4j;


/**
 * Created by wangchunye on 8/29/16.
 * login as soon as connection is ok.
 */
@Slf4j
public class LoginOnConnected implements ChannelFutureListener {
    final private Client client;

    public LoginOnConnected(Client client1) {
        this.client = client1;
    }

    public void operationComplete(ChannelFuture future) throws Exception {
        log.debug("{}: connected", client.getFullName());
        if (future.isSuccess()) {
            sendProvision();
        } else {
            log.error("{}: login failed due to {}", client.getFullName(), future.cause());
            client.close();
        }
    }

    private void sendProvision() {
        client.writeAndFlush(Msync.Provision.newBuilder().setOsType(Msync.Provision.OsType.OS_OSX)
                .setVersion("3.99")
                .setNetworkType(Msync.Provision.NetworkType.NETWORK_WIRE)
                .build());
    }
}
