package com.mugen.customexception.exception;

public class ApiEntityNotFoundException extends RuntimeException{

    public ApiEntityNotFoundException(String message) {
        super(message);
    }

    public ApiEntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
