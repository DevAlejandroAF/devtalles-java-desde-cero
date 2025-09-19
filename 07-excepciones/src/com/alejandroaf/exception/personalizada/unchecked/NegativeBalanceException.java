package com.alejandroaf.exception.personalizada.unchecked;

public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
