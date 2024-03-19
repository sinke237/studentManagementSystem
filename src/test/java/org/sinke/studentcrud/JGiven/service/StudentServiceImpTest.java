package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.jupiter.api.Test;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpTest extends ScenarioTest<StudentGiven, StudentWhen, StudentThen> {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saving_and_retrieving_student_should_work_correctly(){
        given().a_student_service();
        Student student = new Student(1L, "Bob", "Thomas", "bob@gmail.com");

        when().a_student_is_saved(student);

        then().the_student_should_be_saved_successfully();
            .and().the_student_should_be_retreivable();
    }
}
