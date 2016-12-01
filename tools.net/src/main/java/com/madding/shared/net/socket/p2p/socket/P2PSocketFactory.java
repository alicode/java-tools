package com.madding.shared.net.socket.p2p.socket;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.madding.shared.net.socket.p2p.ISocket;
/**
 * @author axvelazq
 */
public class P2PSocketFactory {

	private static P2PSocketFactory factory = new P2PSocketFactory();
	
	public static P2PSocketFactory getSocketFactory(){
		return factory;
	}

	public ISocket makeSocket(Socket socket)throws IOException {
		return new P2PSocket(socket);
	}

	public ISocket makeSocket(String host, int port)throws IOException, UnknownHostException {
		return new P2PSocket(host, port);
	}

}
