package org.sinke.studentcrud.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceImplTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentServiceImpl studentService;

    @Test
    void getAllStudentsFromDBTest(){
//        creating a mock repository
        List<Student> mockStudents = new ArrayList<>();
        mockStudents.add(new Student(1L, "Bob", "Thomas", "bob@gmail.com"));
        mockStudents.add(new Student(2L, "Hans", "Thomas", "hans@gmail.com"));

//        sub findAll() to the mock object
        Mockito.when(studentRepository.findAll()).thenReturn(mockStudents);

        List<Student> result = studentService.getAllStudents();

        assertEquals(2, result.size());
        assertEquals("Bob", result.get(0).getFirstName());
        assertEquals("Thomas", result.get(0).getLastName());

        Mockito.verify(studentRepository, Mockito.times(1)).findAll();
    }
}