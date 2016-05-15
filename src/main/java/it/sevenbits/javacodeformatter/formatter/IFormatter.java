package it.sevenbits.javacodeformatter.formatter;
import it.sevenbits.javacodeformatter.reader.IReader;
import it.sevenbits.javacodeformatter.writer.IWriter;

/**
 * IFormatter interface
 * describe classes to format Java code
 */
public interface IFormatter {
    /**
     * Method for format Java code
     * @param reader input unformatted Java code
     * @param writer output formatted Java code
     * @throws FormatterException
     */
    void format(IReader reader, IWriter writer) throws FormatterException;
}
