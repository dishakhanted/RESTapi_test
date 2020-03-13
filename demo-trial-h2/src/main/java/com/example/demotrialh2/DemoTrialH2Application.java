package com.example.demotrialh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demotrialh2.*"})
public class DemoTrialH2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoTrialH2Application.class, args);
    }

}
