package com.itesoft.ml;

/**
 * @author selim@openlinux.fr.
 */
public class ValidationException extends ApplicationException {
    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
