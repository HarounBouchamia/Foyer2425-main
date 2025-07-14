package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BlocServiceTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("SpringBootTest - Before all tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("SpringBootTest - After all tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("SpringBootTest - Before each test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("SpringBootTest - After each test");
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
