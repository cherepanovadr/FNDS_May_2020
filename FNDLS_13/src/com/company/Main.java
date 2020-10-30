package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Pesho", 123);
        phoneBook.put("Gosho", 123);
        phoneBook.put("Pesho2", 123);
        phoneBook.put("Pesho3", 123);
        phoneBook.put("Pepi", 123);

        phoneBook.remove("Gosho");
        System.out.println(phoneBook.get("Pepi"));
        System.out.println(phoneBook.containsKey("Pepi"));

        int la = phoneBook.get("Pesho");

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + "->"+ entry.getValue());
        }
    }

}
