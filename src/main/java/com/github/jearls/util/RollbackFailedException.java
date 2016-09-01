package com.github.jearls.util;

/**
 * Thrown when an attempt to rollback to a snapshot fails.
 * @author Johnson Earls
 * @version 0.1.0
 */
public class RollbackFailedException extends Exception {
    private static final long serialVersionUID = 1L;

    public RollbackFailedException() {
        super();
    }

    public RollbackFailedException(String message) {
        super(message);
    }

    public RollbackFailedException(Throwable cause) {
        super(cause);
    }

    public RollbackFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
