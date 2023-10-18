package com.example.restapispring.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student("maria", "maria@gmail.com", LocalDate.of(2001, Month.APRIL, 22), 22);
            Student anna = new Student("anna", "anna@gmail.com", LocalDate.of(2002, Month.APRIL, 21), 22);
            repository.saveAll(List.of(maria, anna));
        };
    }


}
