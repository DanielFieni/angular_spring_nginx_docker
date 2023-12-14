package com.locadora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class RegraNegocioException extends RuntimeException{

    public RegraNegocioException(final String message) {
        this(message, null);
    }

    public RegraNegocioException(final String message, final Throwable cause) {
        super(message, cause);
    }



}