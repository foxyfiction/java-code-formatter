package it.sevenbits.javacodeformatter.reader;

/**
 * ReaderException class provides ReaderException
 */
public class ReaderException extends Exception {
    /**
     *
     * @param exception
     */
    public ReaderException(final Exception exception) {
        super(exception.getMessage(), exception.getCause());
    }

}
