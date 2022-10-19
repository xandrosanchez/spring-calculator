package com.example.springcalculator;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Override
    public int addition(int name1, int name2) {
        return name1 + name2;
    }

    @Override
    public int subtraction(int name1, int name2) {
        return name1 - name2;
    }

    @Override
    public int multiplication(int name1, int name2) {
        return name1*name2;
    }

    @Override
    public int division(int name1, int name2) throws IllegalArgumentException {
        if (name2 == 0){
            throw new IllegalArgumentException();
        }
        return name1/name2;
    }

    @Override
    public String getMessage(){
        return "You forgot the argument";
    }
}
