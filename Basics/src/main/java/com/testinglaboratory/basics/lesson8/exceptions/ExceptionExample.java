package com.testinglaboratory.basics.lesson8.exceptions;

import java.util.List;

public class ExceptionExample {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1,1,1,1,1);
        System.out.println(myList);
        try {
            myList.get(7);
            int number = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception exception){
            System.out.println(exception.getCause());
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }
    }
}
