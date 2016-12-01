package com.madding.shared.net.socket.p2p;

import java.io.IOException;

/**
 * The socket interface fot the P2P system.
 * 
 * @author axvelazq
 */
public interface ISocket {

    public void close() throws IOException;

    public int read() throws IOException;

    public int read(byte array[]) throws IOException;

    public void write(byte array[]) throws IOException;
}
