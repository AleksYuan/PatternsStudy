package org.itmo.test.factory;

public class CsvConverterFactory implements DocConverterFactory{
    @Override
    public DocConverter createConverter() {
        return new CsvConverter();
    }
}
