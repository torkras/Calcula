package com.developJavaApps;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int Factorial(int numero) {
        if (numero < 0) {
            return 0;
        }
        else if (numero == 0) {
            return 1;
        }
        else {
            numero *= Factorial(numero - 1);
        }
        return numero;
    }

    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Factorial de 5: " + Factorial(5));
    }
}