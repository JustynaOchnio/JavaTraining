package com.testinglaboratory.basics.lesson4_logic;

import java.util.Scanner;

public class FlowControlExcercise {

    public static void main(String[] args) {
        int userNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("type some number   ");
        userNumber = scanner.nextInt();

        if (userNumber == 0) {
            System.out.println("you Type ONE");
        } else if (userNumber > 0 && userNumber < 100){
            System.out.println("your number is bigger than ZERO and smaller than 100");
        } else {
            System.out.println("your number is bigger than 100");
        }

        switch (userNumber){
            case 0:
                System.out.println("you typed 0");
                break;
            case 10:
                System.out.println("you typed 10");
                break;
            case 20:
                System.out.println("you typed 20");
                break;

            default:
                System.out.println("I don't understand you");
        }
    }
}
