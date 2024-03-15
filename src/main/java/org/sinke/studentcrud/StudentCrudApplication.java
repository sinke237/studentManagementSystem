package org.sinke.studentcrud;

import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentCrudApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception{
        Student student1 = new Student("Halaad", "Erling", "erling@gmail.com");
        Student student2 = new Student("Rash", "Nick", "nick@gmail.com");
        Student student3 = new Student("Martine", "Ma", "ma@gmail.com");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
    }
}
