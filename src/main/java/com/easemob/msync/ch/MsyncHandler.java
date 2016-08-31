package com.easemob.msync.ch;

import com.easemob.msync.ClientData;

import easemob.pb.Msync;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

/**
 * Created by wangchunye on 8/29/16.
 * @Deprecated
 */
public class MsyncHandler extends ChannelOutboundHandlerAdapter{
    private boolean isLogin = false;
    private final ClientData client;

    public MsyncHandler(ClientData client) {
        this.client = client;
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        Msync.MSync.Builder builder = Msync.MSync.newBuilder();
        builder.setAuth(client.getPassword());
        if(msg instanceof Msync.Provision) {
            builder.setCommand(Msync.MSync.Command.PROVISION);
        }else{
            throw new ClassCastException(msg.getClass().getName());
        }
    }
}
