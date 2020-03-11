package io.netty.util.internal;

import java.nio.channels.NotYetConnectedException;

public class NettyNotYetConnectedException extends NotYetConnectedException {

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}