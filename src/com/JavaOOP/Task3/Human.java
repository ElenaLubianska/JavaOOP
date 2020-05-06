package com.JavaOOP.Task3;

public class Human {
    private String name, surname, nation;
    private int age;
    private boolean sex;

    public Human(String name, String surname, String nation, int age, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.nation = nation;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
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

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", nation='" + nation + '\'' +
                ", age=" + age + ", sex=" + sex + '}';
    }
}
