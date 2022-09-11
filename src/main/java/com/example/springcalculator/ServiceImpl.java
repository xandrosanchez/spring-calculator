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
    public int division(int name1, int name2) {
        if (name2 == 0){
            return 0;
        }
        return name1/name2;
    }
}
