package com.pelekh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double x;
    public static double y;

    public static double a;
    public static double b;
    public static double c;

    public static double min;
    public static double middle;

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            initRectangle();
            initBrick();
        } catch (IOException e) {
            e.printStackTrace();
        }

        searchSmallerBrickEdges();

        boolean what = (min <= x && middle <= y) || (min <= y && middle <= x);
        if (what) {
            System.out.println("Brick was passed in hole");
        } else {
            System.out.println("Brick wasn't passed in hole");
        }
    }

    public static void initRectangle() throws IOException {
        System.out.print("Enter length of hole edges: ");
        String rectangle = bufferedReader.readLine();
        String[] rectangleEdges = rectangle.split(" ");
        x = Double.parseDouble(rectangleEdges[0]);
        y = Double.parseDouble(rectangleEdges[1]);
    }

    public static void initBrick() throws IOException {
        System.out.print("Enter length of brick edges: ");
        String brick = bufferedReader.readLine();
        String[] brickEdges = brick.split(" ");
        a = Double.parseDouble(brickEdges[0]);
        b = Double.parseDouble(brickEdges[1]);
        c = Double.parseDouble(brickEdges[2]);
    }

    public static void searchSmallerBrickEdges() {
        if (a <= c && a <= b) {
            min = a;
            if (c <= b) {
                middle = c;
            } else {
                middle = b;
            }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                middle = a;
            } else {
                middle = c;
            }
        } else {
            min = c;
            if (a <= b) {
                middle = a;
            } else {
                middle = b;
            }
        }
    }
}

