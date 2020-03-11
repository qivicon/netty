package io.netty.util.internal;

import java.util.concurrent.TimeoutException;

public class NettyTimeoutException extends TimeoutException {

    public NettyTimeoutException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}