package org.sinke.studentcrud.repository;

import org.sinke.studentcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
