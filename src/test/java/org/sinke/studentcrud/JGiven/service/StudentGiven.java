package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.sinke.studentcrud.service.impl.StudentServiceImpl;

public class StudentGiven extends Stage<StudentGiven> {
    @Mock
    private StudentRepository studentRepository;

    @BeforeStage
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    public StudentGiven a_student_service(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
        return self();
    }

    public StudentRepository getStudentRepository(){
        return studentRepository;
    }
}
