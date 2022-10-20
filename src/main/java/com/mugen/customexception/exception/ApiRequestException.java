package com.mugen.customexception.exception;

// on creer un exception customiser qui herite de la classe de base des exception
// c'est un nouveau type d'exception qu'on pourra declencher

public class ApiRequestException extends RuntimeException{

    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
