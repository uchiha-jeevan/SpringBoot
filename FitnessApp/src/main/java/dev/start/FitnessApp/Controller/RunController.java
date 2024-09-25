package dev.start.FitnessApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {



    @GetMapping("/")
    public String home(){
        return "Hello , This is HealthCheck page";
    }

}
