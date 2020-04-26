package com.JavaOOP.Task1a;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Boris", "no wool", 5, true);
        Cat cat2 = new Cat("Vaska","long wool", 6, false);
        Cat cat3 = new Cat("Barsik", "short wool", 1, true );

        System.out.println(cat);
        cat2.sayMeow();
        cat3.walk();

        cat.setName("Sasha");
        System.out.println(cat.getName());
    }
}
