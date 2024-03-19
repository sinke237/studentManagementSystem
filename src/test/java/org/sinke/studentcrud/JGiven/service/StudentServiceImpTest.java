package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class StudentServiceImpTest extends ScenarioTest<StudentGiven, StudentWhen, StudentThen> {
    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }
    // Override the given() method to return a non-null instance of StudentGiven
    @Override
    public StudentGiven given(){
        return new StudentGiven().a_student_service(studentRepository);
    }

    // Override the when() method to return a non-null instance of StudentWhen
    @Override
    public StudentWhen when(){
        return new StudentWhen(studentRepository);
    }

    @Test
    public void saving_and_retrieving_student_should_work_correctly(){
        given().a_student_service(studentRepository);
        Student student = new Student(1L, "Bob", "Thomas", "bob@gmail.com");

        Mockito.when(studentRepository.save(student)).thenReturn(student);
        when().a_student_is_saved(student);

        then().the_student_should_be_saved_successfully()
            .and().the_student_should_be_retreivable();
        // Verify that the save method is called once with the correct student object
        verify(studentRepository, times(1)).save(student);
    }

//    trying to ensure that given() method returns a non-null instance of StudentGiven

}
