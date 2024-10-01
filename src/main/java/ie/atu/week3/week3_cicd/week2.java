package ie.atu.week3.week3_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class week2 {
    @GetMapping("/hello")
    public String message(){
        return "Hello";
    }
@GetMapping("/hello/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your name is "+ name;
    }
}
