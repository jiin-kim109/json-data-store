package com.jiin.jsondatastore.restservice;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.jiin.jsondatastore.restservice.exceptions.RecordNotFoundException;
import com.jiin.jsondatastore.restservice.model.ApiException;

@RestControllerAdvice(annotations = RestApiController.class)
public class ApiExceptionAdvice {

    @ExceptionHandler({RecordNotFoundException.class})
    public ResponseEntity<ApiException> recordNotFoundException(HttpServletRequest request, final RecordNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ApiException.builder()
                        .errorCode(HttpStatus.NOT_FOUND)
                        .errorMessage(e.getMessage())
                        .build());
    }
}
