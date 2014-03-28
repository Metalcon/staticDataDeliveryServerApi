package de.metalcon.sdd.api.exception;

/**
 * Thrown when error occurs while parsing a XML configuration.
 */
public class InvalidXmlConfigException extends InvalidConfigException {

    private static final long serialVersionUID = -7336759329795812876L;

    public InvalidXmlConfigException(
            String message) {
        super(message);
    }

    public InvalidXmlConfigException(
            Throwable cause) {
        super(cause);
    }

    public InvalidXmlConfigException(
            String message,
            Throwable cause) {
        super(message, cause);
    }

}
