package com.first.kubernetes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class KubernetesApplication {

    @Value("${app.message:Hello, Kubernetes!}")
    private String message;

    @GetMapping("/")
    public String home() {
        System.out.println(message);
        return "index"; // looks for index.html in templates
    }


    public static void main(String[] args) {
         // Print the message to the console
        SpringApplication.run(KubernetesApplication.class, args);
    }

}
