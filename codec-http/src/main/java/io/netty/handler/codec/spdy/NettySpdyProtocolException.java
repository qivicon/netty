package io.netty.handler.codec.spdy;

public class NettySpdyProtocolException extends SpdyProtocolException {
    /**
     * Creates a new instance.
     */
    public NettySpdyProtocolException() {
    }

    /**
     * Creates a new instance.
     */
    public NettySpdyProtocolException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

}
