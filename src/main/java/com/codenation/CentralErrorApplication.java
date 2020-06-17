package com.codenation;
import com.codenation.entity.LogError;
import com.codenation.entity.User;
import com.codenation.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

import static com.codenation.enums.Level.WARNING;


@EnableJpaAuditing
@SpringBootApplication
public class CentralErrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CentralErrorApplication.class, args);
    }
/*
    User user=new User(null,"usuario1","teste1@email.com","123456", LocalDateTime.now());
    LogError logError=new LogError(null,WARNING, LocalDateTime.now());
*/

}
