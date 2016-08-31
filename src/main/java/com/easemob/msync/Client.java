package com.easemob.msync;

import java.util.HashSet;
import java.util.Set;

import easemob.pb.Jid;
import easemob.pb.Messagebody;
import easemob.pb.Msync;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    final private ClientData clientData;
    final private ClientListener clientListener;
    private Set<String> locks = new HashSet<String>();
    private Channel channel;

    Client(ClientData clientData, ClientListener clientListener) {
        this.clientData = clientData;
        this.clientListener = clientListener;
    }

    public void lock(Jid.JID jid) {
        log.debug("{} : lock on {}", getFullName(), jid);
        locks.add(jid.getName());
    }

    public void unlock(Jid.JID jid) {
        log.debug("{} : unlock on {}", getFullName(), jid);
        locks.remove(jid.getName());
    }

    public boolean isLocked(Jid.JID jid) {
        log.debug("{} : check lock on {} return {}", getFullName(), jid,locks.contains(jid));
        return locks.contains(jid.getName());
    }

    public String getFullName() {
        return clientData.getAppkey() + "_" + clientData.getUser() + "@" + clientData.getDomain();
    }

    public ClientData getClientData() {
        return clientData;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public ChannelFuture writeAndFlush(Object msg) {
        return channel.writeAndFlush(msg)
                .addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
    }

    public void close() {
        channel.close(channel.voidPromise());
        channel = null;
    }

    public boolean fireReadMeta(Messagebody.MessageBody meta) {
        // @TODO implement meta to string
        return clientListener.readMessage(this,meta.toString());
    }
}
