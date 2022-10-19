package com.example.springcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public String welcome() {
        return "Welcome to calculator";
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return service.getMessage();
        }
        return String.valueOf(service.addition(num1, num2));
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return service.getMessage();
        }
        return String.valueOf(service.subtraction(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return service.getMessage();
        }
        return String.valueOf(service.multiplication(num1, num2));
    }

    @GetMapping("/divide")
    public String division(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return service.getMessage();
        }
        return String.valueOf(service.division(num1, num2));
    }


}