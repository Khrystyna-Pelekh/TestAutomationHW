package com.pelekh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name? ");
        String name = bufferedReader.readLine();
        System.out.print("Where are you live, " + name + "? ");
        String address = bufferedReader.readLine();
        System.out.println("Your name: " + name + ";\nYour address: " + address + ".");
    }
}
