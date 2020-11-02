package com.springBootExamples.retry.ver1;

public class ApiRetryException extends RuntimeException{

    public ApiRetryException(String message) {
        super(message);
    }
}
