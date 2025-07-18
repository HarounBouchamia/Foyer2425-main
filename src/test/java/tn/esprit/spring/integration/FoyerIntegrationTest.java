package tn.esprit.spring.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.Services.Foyer.FoyerService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class FoyerIntegrationTest {

    @Autowired
    private FoyerService foyerService;

    @Test
    void contextLoads() {
        assertThat(foyerService).isNotNull();
    }
} 