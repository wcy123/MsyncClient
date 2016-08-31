package com.easemob.msync;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by wangchunye on 8/30/16.
 * a dummy listner.
 */

@Slf4j
public class DummyClientListener implements ClientListener{

    public boolean readMessage(Client client, String json) {
        log.info("{}: receive message {}", client.getFullName(), json);
        return true;
    }
}
