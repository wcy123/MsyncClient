package com.easemob.msync;

/**
 * Created by wangchunye on 8/30/16.
 * listener class to receive all event
 */
public interface ClientListener {
    /**
     * @param client the client object
     * @param json received message. @TODO use easemob.message
     * @return false indicates the message is processed correctly and can be safely removed from
     * the queue on a server.
     */
    boolean readMessage(Client client, String json);
}
