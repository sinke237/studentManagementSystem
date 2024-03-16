package org.sinke.studentcrud.test;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceTest {
    @Mock
    private StudentService studentService;

    @InjectMocks
    private StudentService studentServiceMock;

    @Test
    public void testGetAllStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Alice", "Shaw"));
        Mockito.when(studentServiceMock.getAllStudents()).thenReturn(students);

        List<Student> result
    }
}
