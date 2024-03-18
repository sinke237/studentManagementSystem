package org.sinke.studentcrud.JGiven.service;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.jupiter.api.Test;
import org.sinke.studentcrud.repository.StudentRepository;
import org.springframework.boot.test.mock.mockito.MockBean;

public class StudentServiceTest extends ScenarioTest<Given, When, Then> {
    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void test_scenarios_exec(){
        given().a_list_of_students();
        when().get_all_students();
        then().all_students_should_be_returned();
    }

    public Given given() {
        return new Given();
    }

    public When when() {

        When when = new When();
        when.providedStudentRepository = studentRepository;
        return new When();
    }
}
