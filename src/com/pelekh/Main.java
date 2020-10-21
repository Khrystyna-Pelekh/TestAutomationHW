package com.pelekh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        Integer number = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String n2 = String.valueOf(number * number);
        System.out.println(n2.contains("3") ? "Number n^2 contains digit 3" : "Number n^2 doesn't contain digit 3");
        System.out.println("Reverse: " + new StringBuilder(number.toString()).reverse());

        String replace = number.toString();
        replace = replace.length() > 1 ? replace.charAt(replace.length() - 1) + replace.substring(1, replace.length() - 1)
                + number.toString().charAt(0) : replace;
        System.out.println("Replace the first with last: " + replace);

        System.out.println("Write 1 in begin and end: 1" + number.toString() + "1");
    }
}
