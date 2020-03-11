package io.netty.util.internal;

import java.nio.channels.ClosedChannelException;

public class NettyClosedChannelException extends ClosedChannelException {

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}