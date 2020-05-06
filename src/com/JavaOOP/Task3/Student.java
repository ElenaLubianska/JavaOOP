package com.JavaOOP.Task3;

public class Student extends Human {
    private String university, faculty;
    private int course, numberRecordBook;

    public Student(String name, String surname, String nation, int age, boolean sex, String university, String faculty, int course, int numberRecordBook) {
        super(name, surname, nation, age, sex);
        this.university = university;
        this.faculty = faculty;
        this.course = course;
        this.numberRecordBook = numberRecordBook;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getNumberRecordBook() {
        return numberRecordBook;
    }

    public void setNumberRecordBook(int numberRecordBook) {
        this.numberRecordBook = numberRecordBook;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", numberRecordBook=" + numberRecordBook +
                '}';
    }
}
