package ie.atu.week3.week3_cicd;

import org.springframework.web.bind.annotation.*;

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
    public String details(@RequestParam String name, @RequestParam(required = false) int age)
    {
        return name + " "+ age;
    }



    @GetMapping("/message")
    public String getMessage(){
        return "the message";

    }

}
