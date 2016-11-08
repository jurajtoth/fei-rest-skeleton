package sk.fei.ci.fei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    
    /**
     * Main method of the application.
     * Run application using this method.
     * Application will start as a web application accessible @ http://localhost:8080
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
