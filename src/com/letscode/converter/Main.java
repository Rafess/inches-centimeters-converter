package com.letscode.converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inchesScanner = new Scanner(System.in);
        System.out.print("Digite um valor em polegadas:");
        float inchesValue = inchesScanner.nextFloat();
        convertInches(inchesValue);
    }
    private static void convertInches(float inchesValue) {
        final float CONVERTER_VALUE = 2.54f;
        float centimetersValue = inchesValue * CONVERTER_VALUE;
        System.out.printf("%.2f polegadas equivalem a %.2f centímetros", inchesValue, centimetersValue);
    }
}
