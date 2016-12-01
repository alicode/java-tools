package com.madding.shared.net.socket.p2p;

/**
 * Router
 * @author axvelazq
 *
 */
public class Router implements IRouter {
	private Node node;
	public Router(Node node){
		this.node = node;
	}
	@Override
	public Peer route(String peerId) {
		if(node.getPeerKeys().contains(peerId)){
			return node.getPeer(peerId);
		}else{
			return null;
		}
		
	}

}
