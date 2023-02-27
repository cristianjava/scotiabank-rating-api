/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.api.rating.application.handler.exception;

import com.api.rating.domain.exception.RatingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RatingExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RatingException.class)
    public ResponseEntity<ErrorDetails> exception(RatingException ex) {
        ErrorDetails errorModel = new ErrorDetails(ex.getState(), ex.getMessage());
        return new ResponseEntity(errorModel, HttpStatus.PRECONDITION_FAILED);
    }
}
