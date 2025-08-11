package org.example;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeStudentName(Student student, String newName){
        System.out.println("Name before change: " + getName());
        student.name = newName;
        System.out.println("Name after change: " + getName());
    }
}
