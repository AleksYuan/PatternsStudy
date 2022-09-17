package org.itmo.test.prototype;

// Задача определить вид создаваемых объектов с помощью экземпляра - прототипа
// и создавать новые объекты используя этот прототип
//
// Используется для создания копий заданного объекта

import java.util.HashMap;
import java.util.Map;

public class Prototype {
    public static void main(String[] args) {
        Map<String, Long> namesAndNums = new HashMap<>();
        namesAndNums.put("John", 123456L);
        namesAndNums.put("Eiza", 321L);
        namesAndNums.put("Michael", 1479L);
        namesAndNums.put("Bob", 183L);

        PhoneBook phoneBook = new PhoneBook(namesAndNums);
        System.out.println(phoneBook);

        PhoneBookCreator phoneBookCreator = new PhoneBookCreator(phoneBook);
        PhoneBook cloneBook = phoneBookCreator.clonePhoneBook();
        System.out.println(cloneBook);

//        через метод клоне объекта object
        try {
            PhoneBook clone = (PhoneBook) phoneBook.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
