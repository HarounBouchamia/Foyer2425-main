package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MonIntegrationTTIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetEndpoint() {
        String response = this.restTemplate.getForObject("/api/hello", String.class);
        assertThat(response).isEqualTo("Hello World");
    }
}
