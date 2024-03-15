package org.sinke.studentcrud.service.impl;

import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.sinke.studentcrud.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
