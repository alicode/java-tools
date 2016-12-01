package com.madding.shared.net.socket.p2p;

/**
 * Handles a new incomming connection from a peer.
 * 
 * @author axvelazq
 */
public interface IHandler {

    public void handleMessage(Connection conn, Message message);
}
