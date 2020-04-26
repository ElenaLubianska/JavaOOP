package com.JavaOOP.Task1b;

public class Triangle {
    private double sideA, sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public double square(){
        double s = (sideA * sideB) / 2;
        return s;
    }
}
