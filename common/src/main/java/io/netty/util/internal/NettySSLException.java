package io.netty.util.internal;

import javax.net.ssl.SSLException;

public class NettySSLException extends SSLException {
    public NettySSLException(String s) {
        super(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}