package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import org.sinke.studentcrud.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Given extends Stage<Given> {
    private List<Student> students;

    public Given a_list_of_students() {
        students = new ArrayList<>();
        students.add(new Student(1L, "Bob", "Thomas", "bob@gmail.com"));
        return this;
    }
}
