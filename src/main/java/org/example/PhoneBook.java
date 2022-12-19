package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public int addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        return contacts.size();

    }

    public String findByNumber(String phonenumbers){
        return contacts.entrySet().stream()
                .filter(x-> phonenumbers.equals(x.getValue()))
                .findFirst().map(Map.Entry::getKey)
                .orElse("Такого номера нет");
    }
}