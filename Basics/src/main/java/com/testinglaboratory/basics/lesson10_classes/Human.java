package com.testinglaboratory.basics.lesson10_classes;

import com.github.javafaker.Faker;

public class Human {

    private final String race = new Faker().demographic().race();
    private final String name = new Faker().name().name();
    private final int height = new Faker().random().nextInt(100, 200);
    final double health = (double) new Faker().random().nextInt(0, 100);
    final String sex = new Faker().demographic().sex();

    public String getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getHealth() {
        return health;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "race='" + race + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
