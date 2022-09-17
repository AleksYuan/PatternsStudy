package org.itmo.test.factory;

/* задача делегиирования создания экземпляров другому классу
 * изначально неизвестно экземпляры какого класса нужно создавать
 */
public class CsvConverter implements DocConverter {
    @Override
    public void convertFile() {
        System.out.println("CSV convert");
    }
}
