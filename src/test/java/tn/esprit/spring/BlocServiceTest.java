package tn.esprit.spring;

import org.junit.After;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class BlocServiceTest {

    @BeforeAll
    public static void bedore() {
        System.out.println("Before all tests");
    }

    @AfterAll
    public static void after() {
        System.out.println("After all tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test");
    }

    @Order(1)
    @RepeatedTest(4)
    void test() {
        Assertions.assertTrue(true); // dummy test
    }

    @Order(4)
    @Test
    void test2() {
        Assertions.assertFalse(false);
    }

    @Order(2)
    @Test
    void test3() {
        int sum = 2 + 2;
        Assertions.assertEquals(4, sum);
    }

    @Order(3)
    @Test
    void test4() {
        String message = "Hello";
        Assertions.assertNotNull(message);
    }
}