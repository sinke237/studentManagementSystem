package org.sinke.studentcrud.entity;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    public Student() {
    }
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
