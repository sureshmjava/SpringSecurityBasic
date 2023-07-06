package security.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String getMessage(){
        return("<h1> Welcome to Spring Boot Application with Security");
    }
}
