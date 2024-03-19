package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.junit.jupiter.api.Assertions;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.service.impl.StudentServiceImpl;

public class StudentThen extends Stage<StudentThen> {
    @ExpectedScenarioState
    private StudentServiceImpl studentService;

    @ExpectedScenarioState
    private Student savedStudent;

    public StudentThen the_student_should_be_saved_successfully(){
        Assertions.assertNotNull(savedStudent, "The student should be saved successfully");
//        I'll add more later
        return self();
    }

    public StudentThen the_student_should_be_retreivable(){
        Student retrievedStudent = studentService.getStudentById(savedStudent.getId());
//        I'll add more later
        return self();
    }
}
