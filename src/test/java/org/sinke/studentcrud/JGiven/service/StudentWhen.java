    package org.sinke.studentcrud.JGiven.service;

    import com.tngtech.jgiven.Stage;
    import com.tngtech.jgiven.annotation.BeforeStage;
    import com.tngtech.jgiven.annotation.ExpectedScenarioState;
    import org.mockito.InjectMocks;
    import org.mockito.MockitoAnnotations;
    import org.sinke.studentcrud.entity.Student;
    import org.sinke.studentcrud.repository.StudentRepository;
    import org.sinke.studentcrud.service.impl.StudentServiceImpl;

    public class StudentWhen extends Stage<StudentWhen> {
        private final StudentServiceImpl studentService;
        private Student savedStudent;

        public StudentWhen(StudentRepository studentRepository) {
            this.studentService = new StudentServiceImpl(studentRepository);
        }

        public StudentWhen a_student_is_saved(Student student) {
            this.savedStudent = studentService.saveStudent(student);
            return self();
        }

        public Student getSavedStudent() {
            return this.savedStudent;
        }
    }
