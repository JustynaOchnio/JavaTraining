package com.testinglaboratory.basics.lesson8.collections;

import com.testinglaboratory.basics.lesson6_classes_introduction.Cars;
import com.testinglaboratory.basics.lesson6_classes_introduction.ClassConventions;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<String, Integer> stringKeyIntValue;
        Map<String, Integer> stringKeyIntValueOf = Map.of("Str", 1);
        Map<String, ClassConventions> myMap = new HashMap<>();

        ClassConventions clasCon = new ClassConventions();
        myMap.put("My convention", clasCon);

        ClassConventions objectClassConventions = myMap.get("My convention");

        myMap.remove("someKey");

        //todo create map with numbers as Keys and YourOwnClass form lesson 6. Discover some useful maps methods

        Map <Integer, Cars> carsMap = new HashMap<>();

        Cars cars = new Cars();
        carsMap.put(1, new Cars("biały", "autosan", 21, 16000));
        carsMap.put(2, new Cars("zielony", "fiat", 2, 10000));
        carsMap.put(3, new Cars("czarny", "maluch", 2, 54000));
        System.out.println(carsMap.get(1));
        System.out.println(carsMap.get(2).getBrand());
        System.out.println(carsMap.get(3).setColor("fioletowy"));
    }
}
