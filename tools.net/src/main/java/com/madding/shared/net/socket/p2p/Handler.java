package com.madding.shared.net.socket.p2p;

public abstract class Handler implements IHandler {

    private Node node;

    public Handler(Node node){
        this.node = node;
    }

    protected Node getNode() {
        return this.node;
    }

}
