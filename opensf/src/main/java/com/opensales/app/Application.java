package com.opensales.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan
@ComponentScan("com")
//@EnableJpaRepositories("com.opensales.app.repository")
public class Application {

        public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
        }

}