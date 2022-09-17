package org.itmo.test.prototype;

public class PhoneBookCreator {
    private PhoneBook phoneBook;

    public PhoneBookCreator(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook clonePhoneBook() {
        return (PhoneBook) this.phoneBook.copy();
    }
}
