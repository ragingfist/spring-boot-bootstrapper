package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: Flyway with Spring
// TODO: integrate with Jenkins container
// TODO: kubernetes
// TODO: Spring Security and data encryption

// TODO: json with Spring Data
// TODO: in-memory database tests with json
// TODO: RestController and RestExceptionHandler and Controller level tests
// TODO: Log Filter
@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String home() {
        String val = "Hello docker!";
        return "Hello Docker World";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}