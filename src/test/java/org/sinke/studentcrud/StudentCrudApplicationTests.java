package org.sinke.studentcrud;

import org.junit.jupiter.api.Test;
import org.sinke.studentcrud.test.StudentServiceTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = StudentServiceTest.class)
class StudentCrudApplicationTests {


    @Test
    void contextLoads() {
    }

}
