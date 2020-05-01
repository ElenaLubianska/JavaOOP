package com.JavaOOP.Task2a;

public class Foursquare extends Shape {
    private Point a, b, c, d;

    public Foursquare(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        return a.getDistance(b) + b.getDistance(c) + c.getDistance(d) + d.getDistance(a);
    }

    @Override
    public double getArea() {
        Triangle tr1 = new Triangle(a, b, c);
        Triangle tr2 = new Triangle(a, c, d);
        return Math.round(tr1.getArea() + tr2.getArea());
    }

    @Override
    public String toString() {
        return "Foursquare{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
