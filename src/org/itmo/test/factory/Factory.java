package org.itmo.test.factory;

/* задача делегиирования создания экземпляров другому классу
 * изначально неизвестно экземпляры какого класса нужно создавать
 */

public class Factory {
    public static void main(String[] args) {
//        DocConverter conv2 = new CsvConverter();
//        DocConverter conv3 = new DocxConverter();
//
//        conv2.convertFile();
//        conv3.convertFile();


        DocConverterFactory docConverterFactory = createConvertFactoryByFormat("docx");
        DocConverter converter = docConverterFactory.createConverter();
        converter.convertFile();
    }


    public static DocConverterFactory createConvertFactoryByFormat(String format) {
        if (format.equalsIgnoreCase("csv")) {
            return new CsvConverterFactory();
        } else if (format.equalsIgnoreCase("docx")) {
            return new DocxConverterFactory();
        } else {
            throw new RuntimeException("Wrong format: " + format );
        }
    }
}
