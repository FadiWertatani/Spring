package tn.esprit.sleam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SleamApplication {

    public static void main(String[] args) {

        SpringApplication.run(SleamApplication.class, args);
    }

}
