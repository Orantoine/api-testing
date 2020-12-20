package fr.orantoine.firsttest;

import fr.orantoine.firsttest.services.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FirstTestApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {
    }


    @Test
    void testReturnInput() {
        assertEquals("input", testService.returnInput("input"));
    }

    @Test
    void testReturnInput2() {
        assertEquals("test", testService.returnInput("test"));
    }

    @Test
    void testReturnInputNull() {
        assertEquals(null, testService.returnInput(null));
    }

}
