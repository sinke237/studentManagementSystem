package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.sinke.studentcrud.service.impl.StudentServiceImpl;

public class StudentThen extends Stage<StudentThen> {
    @ExpectedScenarioState
    private StudentServiceImpl studentService;

    public StudentThen the_student_should_be_saved_successfully(){
        // assertions

        return self();
    }

    public StudentThen the_student_should_be_retreivable(){
        // assertions

        return self();
    }
}
