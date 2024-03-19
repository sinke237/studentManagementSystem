package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.service.impl.StudentServiceImpl;

public class StudentWhen extends Stage<StudentWhen> {
    @ExpectedScenarioState
    private StudentServiceImpl studentService;

    public StudentWhen a_student_is_saved(Student student){
        studentService.saveStudent(student);
        return self();
    }
}
