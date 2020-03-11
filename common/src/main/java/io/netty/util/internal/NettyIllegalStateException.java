package io.netty.util.internal;

public class NettyIllegalStateException extends IllegalStateException {
    public NettyIllegalStateException(String s) {
        super(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}