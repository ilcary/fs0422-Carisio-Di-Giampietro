package com.danieleterr.springjpa.springjpa.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class PageError {
    private String message;
    private HttpStatus status;

}
