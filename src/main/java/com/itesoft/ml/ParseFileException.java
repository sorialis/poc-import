package com.itesoft.ml;

/**
 * @author selim@openlinux.fr.
 */
public class ParseFileException extends ApplicationException {
    public ParseFileException(String message) {
        super(message);
    }

    public ParseFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
