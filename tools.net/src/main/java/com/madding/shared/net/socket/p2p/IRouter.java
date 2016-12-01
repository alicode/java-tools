package com.madding.shared.net.socket.p2p;

/**
 * Used to determine the next hoop for a message to be routed to in the p2p network
 * 
 * @author axvelazq
 */
public interface IRouter {

    public Peer route(String peerId);
}
