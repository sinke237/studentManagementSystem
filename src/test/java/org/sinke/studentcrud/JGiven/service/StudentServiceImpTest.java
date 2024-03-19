package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceImpTest extends ScenarioTest<StudentGiven, StudentWhen, StudentThen> {
    @Mock
    private StudentRepository studentRepository;

    @Test
    public void saving_and_retrieving_student_should_work_correctly(){
        given().a_student_service();
        Student student = new Student(1L, "Bob", "Thomas", "bob@gmail.com");

        Mockito.when(studentRepository.save(student)).thenReturn(student);
        when().a_student_is_saved(student);

        then().the_student_should_be_saved_successfully()
            .and().the_student_should_be_retreivable();
    }

//    trying to ensure that given() method returns a non-null instance of StudentGiven
    @Override
    public StudentGiven given(){
        return super.given().a_student_service();
    }
}
