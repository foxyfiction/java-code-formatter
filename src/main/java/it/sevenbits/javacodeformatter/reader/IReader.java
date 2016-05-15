package it.sevenbits.javacodeformatter.reader;

/**
 * IReader interface
 * describe classes for reading characters
 */
public interface IReader {
    /**
     * Read one symbol from input stream
     * @return received symbol
     * @throws ReaderException
     */
    Character read() throws ReaderException;

    /**
     * Proof end of stream
     * @return boolean value. false -- not end, true -- end of stream
     */
    public Boolean isEnd();

    /**
     * Close input stream
     * @throws ReaderException
     */
    void close() throws ReaderException;

}
