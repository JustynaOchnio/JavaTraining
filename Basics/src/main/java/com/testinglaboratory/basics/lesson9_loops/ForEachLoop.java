package com.testinglaboratory.basics.lesson9_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachLoop {

    public static void main(String[] args) {
        List<String> personLists = new ArrayList<>();
        personLists.add("Josh");
        personLists.add("Anna");
        personLists.add("Milfred");


        for (String person : personLists) {
            System.out.println(person);
        }

        Map<String, String> p = new HashMap<>();
        p.put("Josh", "1");
        p.put("Anna", "2");
        p.put("Milfred", "3");
        System.out.println(p);

        for (Map.Entry<String, String> person : p.entrySet()){
            System.out.println(person.getKey());
            System.out.println(person.getValue());
        }
    }

    //todo try to copy to other list only those person who name have 4 letters.
}
