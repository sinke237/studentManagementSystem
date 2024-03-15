package org.sinke.studentcrud.controller;

import org.sinke.studentcrud.entity.Student;
import org.sinke.studentcrud.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("student", studentService.getAllStudents());
        return "students";
    }
//  create new student
    @GetMapping("/student/new")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }
//    save new student
    @PostMapping("/student")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}
