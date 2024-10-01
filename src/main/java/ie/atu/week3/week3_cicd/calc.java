package ie.atu.week3.week3_cicd;

import org.springframework.web.bind.annotation.*;

@RestController
public class calc {

    @GetMapping("/calculate")
    public String details(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        switch(operation){
            case "add":{
                int add = num1 + num2;
                return num1 + " + " + num2 + " = " + add;
            }
            case "subtract":{
                int sum = num1 - num2;
                return num1 + " - " + num2 + " = " + sum;
            }
            case "multiply":{
                int prod = num1 * num2;
                return num1 + " x " + num2 + " = " + prod;
            }
            case "divide":{
                float divide = (float)num1 / (float)num2;
                if(num2==0){
                    return "Warning second number cant be 0";
                }
                else {
                    return num1 + " / " + num2 + " = " + divide;
                }
            }
        }
        return operation;

    }

}
