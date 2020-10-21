package com.acey.support.exceptions;

public class SystemException extends RuntimeException {
    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Object... args) {
        super(String.format(message, args));
    }
}
