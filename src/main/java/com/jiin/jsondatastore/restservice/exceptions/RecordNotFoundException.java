package com.jiin.jsondatastore.restservice.exceptions;

public class RecordNotFoundException extends RuntimeException {

    private static final String RECORD_NOT_FOUND = "Record not found";

    public RecordNotFoundException() { super(RECORD_NOT_FOUND); }

    public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException(Throwable cause) { super(cause); }

    public RecordNotFoundException(String message, Throwable cause) { super(message, cause); }
}
