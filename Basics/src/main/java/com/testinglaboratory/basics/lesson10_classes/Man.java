package com.testinglaboratory.basics.lesson10_classes;

import com.github.javafaker.Faker;

public class Man extends Human {

    private final int caughtFish = new Faker().random().nextInt(100);
    private final int testicles = new Faker().random().nextInt(2);
    private final int genitalsSize = new Faker().random().nextInt(20);

    public int getCaughtFish() {
        return caughtFish;
    }

    public int getTesticles() {
        return testicles;
    }

    public int getGenitalsSize() {
        return genitalsSize;
    }

    @Override
    public String toString() {
        return "Man{" +
                "caughtFish=" + caughtFish +
                ", testicles=" + testicles +
                ", genitalsSize=" + genitalsSize +
                '}';
    }
}
