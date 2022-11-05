package com.testinglaboratory.basics.lesson6_classes_introduction;

public class RunnableClassExcercise {

    public static void main(String[] args) {

        ClassConventions classObjectDeclaration;

        ClassConventions someClass = new ClassConventions();
        ClassConventions classConventionsPreDef = new ClassConventions("preDef");

        Cars cars = new Cars("black", "audi", 4, 25000);

        System.out.println(someClass);
        System.out.println(someClass.getField());
        System.out.println(someClass.getNumber());

        System.out.println(classConventionsPreDef);
        System.out.println(classConventionsPreDef.getField());
        System.out.println(classConventionsPreDef.getOtherField());
        System.out.println(classConventionsPreDef.getNumber());

        classConventionsPreDef.incrementNumber();
        System.out.println(classConventionsPreDef.getNumber());
        classConventionsPreDef.incrementNumber(5);
        System.out.println(classConventionsPreDef.getNumber());

        //TODO create Yours Own Class representing a Toy. (max 4 fields name,color etc.) and implements operations on it;

        System.out.println(cars.getBrand());

        String newBrand = cars.setBrand("maluch");
        System.out.println(newBrand);

        String newColor = cars.setColor("red");
        System.out.println(newColor);

        cars.increaseDoorsSize(5);
        System.out.println(cars.getDoors());

        cars.modifyCarColor("white");
        System.out.println(cars.getColor());
    }
}
