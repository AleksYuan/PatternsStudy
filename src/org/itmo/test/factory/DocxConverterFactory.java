package org.itmo.test.factory;

public class DocxConverterFactory implements DocConverterFactory{
    @Override
    public DocConverter createConverter() {
        return new DocxConverter();
    }
}
