package com.pelekh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Integer number = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String n2 = String.valueOf(number * number);
        System.out.println(n2.contains("3") ? "Number n^2 contains digit 3" : "Number n^2 doesn't contain digit 3");
        System.out.println(new StringBuilder(number.toString()).reverse());

        String replace = number.toString();
        replace = replace.charAt(replace.length() - 1) + replace.substring(1, replace.length() - 1)
                + number.toString().charAt(0);
        System.out.println(replace);

        System.out.println("1" + number.toString() + "1");
    }
}
