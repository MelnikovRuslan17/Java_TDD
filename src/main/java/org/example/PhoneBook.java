package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public String findByName(String name){
        return contacts.containsKey(name)? contacts.get(name) : "Такого имени нет в телефонной книге";
    }
    public Set<String> printAllNames(){
        return null;
    }
}