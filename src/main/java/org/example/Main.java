package org.example;

public class Main {
    public static void main(String[] args) {
        // zu Schritt 1
        System.out.println(sum(10, 10));
        // zu Schritt 2
        System.out.println(isEvenOrOdd(5));
        // zu Schritt 3
        System.out.println(product(10, 11));
        // zu Schritt 4
        System.out.println(toUpperCase("auto"));
        // zu Schritt 5
        System.out.println(checkPositiveNumber(2));
    }
    //Schritt 1
    //Schreibe einen Test für eine Methode, die die Summe von zwei ganzen Zahlen berechnet.
    public static int sum(int number1, int number2) {
            return number1 + number2;
    }
    //Schritt 2
    //Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl gerade ist (even).

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
    //Schritt 3
    //Schreibe einen Test für eine Methode, die das Produkt zweier ganzer Zahlen berechnet.
    public static int product(int number1, int number2) {
        return number1 * number2;
    }

    //Schritt 4
    //Schreibe einen Test für eine Methode, die eine gegebene Zeichenkette in Großbuchstaben umwandelt.

    public static String toUpperCase(String word) {
        String wordToUpperCase = word.toUpperCase();
        return wordToUpperCase;
    }
    // Schritt 5
    //Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl positiv ist.
    public static String checkPositiveNumber(int number1) {
        if (number1 > 0) {
            return "Zahl ist positiv";
        } else {
            return "Zahl ist nicht positiv";
        }
    }
}