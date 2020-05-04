package com.JavaOOP.Task2a;

public class Triangle extends Shape {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return Math.round(a.getDistance(b) + b.getDistance(c) + c.getDistance(a));
    }

    @Override
    public double getArea() {
        double a1 = a.getDistance(b);
        double b1 = b.getDistance(c);
        double c1 = c.getDistance(a);
        double p = this.getPerimetr() / 2;
        return Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
