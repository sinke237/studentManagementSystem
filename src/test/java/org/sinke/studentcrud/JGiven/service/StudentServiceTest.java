package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class StudentServiceTest extends ScenarioTest<StudentServiceTest.Given, StudentServiceTest.When, StudentServiceTest.Then> {
    @MockBean
    private StudentRepository studentRepository;

    @ProvidedScenarioState
    private StudentRepository providedStudentRepository;

    public static class Given extends Stage<Given>{
        private List<Student> students;

        public Given a_list_of_students(){
            students = new ArrayList<>();
//            add some data to test students
            return self();
        }
    }

    public static class When extends Stage<When>{
        @ProvidedScenarioState
        private StudentRepository providedStudentRepository;
        public void get_all_students(){
            List<Student> allStudents = providedStudentRepository.findAll();
            self().withAllStudents(allStudents);
        }

        private When withAllStudents(List<Student> allStudents){
            return self();
        }
    }

    public static class Then extends Stage<Then>{
        @ExpectedScenarioState
        private List<Student> allStudents;

        public void all_students_should_be_returned(){

        }
    }
}
