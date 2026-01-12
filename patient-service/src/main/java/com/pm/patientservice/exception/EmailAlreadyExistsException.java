package com.pm.patientservice.exception;

public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String message) {
        super("A patient with this email address already exists");
    }
}
