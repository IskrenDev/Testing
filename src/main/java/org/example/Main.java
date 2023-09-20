package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(10, 10));
        System.out.println(isEvenOrOdd(4));
    }
    //Schritt 1
    public static int sum(int number1, int number2) {
            return number1 + number2;
    }
    //Schritt 2


    public static String isEvenOrOdd(int number1) {
        int result = number1 % 2;
        String testResult = "";
        if (result == 0) {
            testResult = "Die Zahl ist gerade.";
        } else {
            testResult = "Die Zahl ist ungerade.";
        }
        return testResult;
    }
}