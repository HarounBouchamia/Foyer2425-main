package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BlocServiceMockTest {

    @BeforeEach
    void beforeEach() {
        // Mock setup (if needed)
        System.out.println("MockTest - Before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("MockTest - After each");
    }

    @Test
    @Order(1)
    @RepeatedTest(4)
    void testRepeated() {
        Assertions.assertTrue(true); // Dummy repeated test
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertFalse(false);
    }

    @Test
    @Order(3)
    void test3() {
        int sum = 2 + 2;
        Assertions.assertEquals(4, sum);
    }

    @Test
    @Order(4)
    void test4() {
        String message = "Hello";
        Assertions.assertNotNull(message);
    }
}
