package com.grigorem;

import com.grigorem.entity.ThemeParkRide;
import com.grigorem.repository.ThemeParkRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThemeParkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThemeParkApplication.class);
    }

    @Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository themeParkRideRepository) {
        return (args) -> {
            themeParkRideRepository.save(new ThemeParkRide("Rollercoaster", "Train ride that speeds you along.", 5, 3));
            themeParkRideRepository.save(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes.", 3, 2));
            themeParkRideRepository.save(new ThemeParkRide("Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
        };
    }
}
