package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.junit.jupiter.api.Assertions;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.sinke.studentcrud.service.impl.StudentServiceImpl;

public class StudentThen extends Stage<StudentThen> {
    @ExpectedScenarioState
    private StudentRepository studentRepository;

    private StudentServiceImpl studentService;

    @ExpectedScenarioState
    public Student savedStudent;

    public StudentThen(){
        this.studentService = new StudentServiceImpl(studentRepository);
    }

    public StudentThen the_student_should_be_saved_successfully(){
        System.out.println("savedStudent: " + savedStudent);
        Assertions.assertNotNull(savedStudent, "The student should be saved successfully");
//        I'll add more later
        return self();
    }

    public StudentThen the_student_should_be_retreivable(){
        Student retrievedStudent = studentService.getStudentById(savedStudent.getId());
        Assertions.assertEquals(savedStudent, retrievedStudent, "The saved and retrieved students should be the same");
//        I'll add more later
        return self();
    }
}
