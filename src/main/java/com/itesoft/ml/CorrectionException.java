package com.itesoft.ml;

/**
 * @author selim@openlinux.fr.
 */
public class CorrectionException extends ApplicationException {
    public CorrectionException(String message) {
        super(message);
    }

    public CorrectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
