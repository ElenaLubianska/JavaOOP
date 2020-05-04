package com.JavaOOP.Task2a;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(3.0, 1.0);
        Point b = new Point(6.0, 1.0);
        Point c = new Point(6.0, 4.0);
        Point d = new Point(3.0, 4.0);
        Point k = new Point(8.0, 1.0);

        Triangle triangle = new Triangle(a, b, c);
        Foursquare foursquare = new Foursquare(a, b, c, d);
        Trapeze trapeze = new Trapeze(a, b, c, d, k);
        System.out.println(trapeze.getArea());
        System.out.println(triangle.getPerimetr());

    }
}
