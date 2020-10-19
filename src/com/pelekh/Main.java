package com.pelekh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the radius of flower bed:");
        Double radius = Double.parseDouble(bufferedReader.readLine());
        Circle circle = new Circle(radius);
        System.out.println("Area of the flower bed = " + circle.area());
        System.out.println("Perimeter of the flower bed = " + circle.perimeter());
    }
}
