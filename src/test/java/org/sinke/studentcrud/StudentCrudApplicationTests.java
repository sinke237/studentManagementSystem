package org.sinke.studentcrud;

import org.junit.jupiter.api.Test;
import org.sinke.studentcrud.service.impl.StudentServiceImpl;
import org.sinke.studentcrud.service.impl.StudentServiceImplTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {StudentServiceImplTest.class, org.sinke.studentcrud.JGiven.service.StudentServiceImpTest.class})
class StudentCrudApplicationTests {


    @Test
    void contextLoads() {
    }

}
