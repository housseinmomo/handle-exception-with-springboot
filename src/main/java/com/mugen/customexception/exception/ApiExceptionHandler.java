package com.mugen.customexception.exception;

// cette classe va gerer nos exceptions personnaliser
// Pour chaque exception, nous aurons une methode associer

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){

        // 1. Generer l'entite ApiException qui va contenir les details de notre exception
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                badRequest,
                ZonedDateTime.now()
        );

        // 2. Retourner l'entite ApiException
        return new ResponseEntity<>(apiException, badRequest);
    }
}
