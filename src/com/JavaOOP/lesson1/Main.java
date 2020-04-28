package com.JavaOOP.lesson1;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("java");
        str1.concat(" hot");
        System.out.println(str1);

        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb.append(" hot"));
        sb.insert(1,"g");
        sb.deleteCharAt(1);
        sb.reverse();
        System.out.println(sb);
    }

}
