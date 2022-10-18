package com.example.intermediate;

import com.example.intermediate.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class IntermediateApplication {

  public static void main(String[] args) {
    SpringApplication.run(IntermediateApplication.class, args);
  }

}
