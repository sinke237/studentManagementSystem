package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.sinke.studentcrud.service.impl.StudentServiceImpl;

public class StudentWhen extends Stage<StudentWhen> {
    private StudentServiceImpl studentService;

    public StudentWhen(StudentRepository studentRepository){
        studentService = new StudentServiceImpl(studentRepository); // Manually initialize the studentService object
        MockitoAnnotations.openMocks(this);
    }
    public StudentWhen a_student_is_saved(Student student){
        studentService.saveStudent(student);
        return self();
    }
}
