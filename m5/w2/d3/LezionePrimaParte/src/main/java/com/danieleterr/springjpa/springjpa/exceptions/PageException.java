package com.danieleterr.springjpa.springjpa.exceptions;

public class PageException extends RuntimeException{
    public PageException(String message){
        super("Page Exception: " + message);
    }
}
