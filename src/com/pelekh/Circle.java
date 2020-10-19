package com.pelekh;

public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double perimeter() {
        return 2.0 * Math.PI * radius;
    }

    public Double area() {
        return radius * radius * Math.PI;
    }
}
