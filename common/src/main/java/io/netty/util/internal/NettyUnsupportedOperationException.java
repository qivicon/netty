package io.netty.util.internal;

public class NettyUnsupportedOperationException extends UnsupportedOperationException {

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}