package it.sevenbits.javacodeformatter.reader;

/**
 * StringReader class for reading characters from String variable
 */
public class StringReader implements IReader {

    private final String input;
    private Integer position = 0;

    /**
     * Constructor which set value to string input
     * @param input -- reading string
     */
    public StringReader(final String input) {
        this.input = input;
    }


    /**
     *
     * @return one symbol
     * @throws ReaderException
     */
    public Character read() throws ReaderException {
        try {
            position++;
            return input.charAt(position);
        } catch (StringIndexOutOfBoundsException exception) {
            throw new ReaderException(exception);
        }

    }

    /**
     * method proof end of string
     * @return true -- end of string, false -- not end of string
     */
    public Boolean isEnd() {
        return position == input.length();
    }
    /**
     *
     * @throws ReaderException
     */
    public void close() throws ReaderException {

    }
}
