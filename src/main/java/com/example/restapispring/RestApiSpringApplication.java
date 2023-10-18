package com.example.restapispring;

import com.example.restapispring.demo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class RestApiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiSpringApplication.class, args);
    }

}
