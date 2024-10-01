package ie.atu.week3.week3_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
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

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return  "Salutations "+ name;
    }


    @GetMapping("/details")
    public String getDetails()
    {
        return "some message";
    }

    @GetMapping("/message")
    public String getMessage(){
        return "the message";

    }

}
