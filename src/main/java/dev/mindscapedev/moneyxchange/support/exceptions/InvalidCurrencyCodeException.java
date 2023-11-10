package dev.mindscapedev.moneyxchange.support.exceptions;

public class InvalidCurrencyCodeException extends Exception {

    public InvalidCurrencyCodeException() {
        super("Invalid currency code.");
    }

    public InvalidCurrencyCodeException(String message) {
        super(message);
    }

    public InvalidCurrencyCodeException(String message, Throwable cause) {
        super(message, cause);
    }
}