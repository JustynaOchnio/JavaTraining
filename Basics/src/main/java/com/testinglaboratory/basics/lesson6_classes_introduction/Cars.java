package com.testinglaboratory.basics.lesson6_classes_introduction;

public class Cars {

    private String color;
    private String brand;
    private int doors;
    private int price;

    public Cars(String color, String brand, int doors, int price) {
        this.color = color;
        this.brand = brand;
        this.doors = doors;
        this.price = price;
    }

    public Cars() {
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        this.color = color;
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String setBrand(String brand) {
        this.brand = brand;
        return brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void increaseDoorsSize(int doorNumber) {
        if (doorNumber <= 4) {
            doors += 2;
        } else {
            System.out.println("Your car cannot be bigger");
        }
    }

    public void modifyCarColor(String color){
        setColor(color);
    }
}
