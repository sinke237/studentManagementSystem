package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.junit.jupiter.api.Assertions;
import org.sinke.studentcrud.entity.Student;

import java.util.List;

public class Then extends Stage<Then> {
    @ExpectedScenarioState
    private List<Student> allStudents;

    public void all_students_should_be_returned() {
        Assertions.assertNotNull(allStudents);
        Assertions.assertEquals(1, allStudents.size());
        Assertions.assertTrue(allStudents.stream().anyMatch(student -> student.getFirstName().equals("Bob")));
        Assertions.assertTrue(allStudents.stream().anyMatch(student -> student.getLastName().equals("Thomas")));
        Assertions.assertTrue(allStudents.stream().anyMatch(student -> student.getEmail().equals("bob@gmail.com")));
    }
}
