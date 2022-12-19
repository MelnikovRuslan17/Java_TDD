package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public int addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        return contacts.size();

    }

    public String findByNumber(String number){
        return null;
    }
}