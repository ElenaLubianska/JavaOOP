package com.JavaOOP.Task3;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Anton", "Moroz", "ukrainian", 25, true);
        human1.setAge(20);
        System.out.println(human1.toString());

        Student student1 = new Student("Anna", "Nechesa", "ukrainian", 19, false, "KPI", "programmin", 3, 838);
        Student student2 = new Student("Boris", "Orlov", "russian", 17, true, "MTI", "mathematic", 1, 12);
        Student student3 = new Student("Anastasiua", "Ignatenko", "ukrainian", 18, false, "NAU", "design", 2, 153);

        System.out.println(student1.toString());

        Group group = new Group();
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.seach("Orlov");
        group.deleteStudent("Orlov");
        System.out.println(group);
    }
}
