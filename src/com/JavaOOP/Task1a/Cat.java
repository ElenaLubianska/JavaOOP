package com.JavaOOP.Task1a;

public class Cat {
    private String name, wool;
    private int age;
    private boolean sex;

    public Cat(String name, String wool, int age, boolean sex) {
        this.name = name;
        this.wool = wool;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void walk(){
        System.out.println("go to the garden " + getName());
    }
    public void sayMeow(){
        System.out.println("meow " + getName());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", wool='" + wool + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
