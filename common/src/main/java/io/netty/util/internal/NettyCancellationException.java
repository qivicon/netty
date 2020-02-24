package io.netty.util.internal;

import java.util.concurrent.CancellationException;

public class NettyCancellationException extends CancellationException {

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}