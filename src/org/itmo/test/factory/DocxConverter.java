package org.itmo.test.factory;

public class DocxConverter implements DocConverter {
    @Override
    public void convertFile() {
        System.out.println("DOCX convert");
    }
}
