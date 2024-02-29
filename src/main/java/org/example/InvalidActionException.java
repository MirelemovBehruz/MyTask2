package org.example;

class InvalidActionException extends RuntimeException {
    public InvalidActionException(String message) {
        super(message);
    }
}