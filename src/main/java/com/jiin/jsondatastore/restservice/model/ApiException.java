package com.jiin.jsondatastore.restservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ApiException {
    private final HttpStatus errorCode;
    private final String errorMessage;
}
