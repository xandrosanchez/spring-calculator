package com.example.springcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/calculator")
    public String welcome(){
        return "Welcome to calculator";
    }

    @GetMapping("/calculator/plus")
    public int addition(@RequestParam int num1,@RequestParam int num2){
        return service.addition(num1,num2);
    }

    @GetMapping("/calculator/minus")
    public int subtraction(@RequestParam int num1, @RequestParam int num2){
        return service.subtraction(num1,num2);
    }

    @GetMapping("/calculator/multiply")
    public int multiplication(@RequestParam int num1,@RequestParam int num2){
        return service.multiplication(num1,num2);
    }

    @GetMapping("/calculator/divide")
    public int division(@RequestParam int num1,@RequestParam int num2){
        return service.division(num1,num2);
    }


}