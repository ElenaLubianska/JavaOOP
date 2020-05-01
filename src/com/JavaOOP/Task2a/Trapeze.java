package com.JavaOOP.Task2a;

public class Trapeze extends Shape {
    private Point a, b, c, d, k;


    public Trapeze(Point a, Point b, Point c, Point d, Point k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
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

    public Point getK() {
        return k;
    }

    public void setK(Point k) {
        this.k = k;
    }

    @Override
    public double getPerimetr() {
        return a.getDistance(k) + k.getDistance(c) + c.getDistance(d) + d.getDistance(a);
    }

    @Override
    public double getArea() {
        double a1 = a.getDistance(k);
        double k1 = k.getDistance(c);
        double c1 = c.getDistance(d);
        double d1 = d.getDistance(a);

        return ((a1 + c1) / 2) * d1;
    }

    @Override
    public String toString() {
        return "Trapeze{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
    }
}
