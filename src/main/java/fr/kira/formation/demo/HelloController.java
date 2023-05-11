package fr.kira.formation.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") // Allow all origins
public class HelloController {

    @RequestMapping("/*")
    public String hello() {
        return "Hello World!";
    }
}
