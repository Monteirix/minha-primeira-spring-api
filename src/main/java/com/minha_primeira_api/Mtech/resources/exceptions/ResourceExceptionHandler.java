package com.minha_primeira_api.Mtech.resources.exceptions;


import com.minha_primeira_api.Mtech.services.exceptions.DataBaseException;
import com.minha_primeira_api.Mtech.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Resource Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err =  new StandardError(Instant.now(), status.value() , error , e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);

    }
    @ExceptionHandler
    public ResponseEntity<StandardError> dataBase(DataBaseException e, HttpServletRequest request){
        String error = "Data Base Errror";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err =  new StandardError(Instant.now(), status.value() , error , e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);

    }

}
