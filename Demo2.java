package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Demo2 {
    @Autowired
    @Qualifier("demo_randemo3")
    public Demo3 demo3;
    public Demo2(){
        System.out.println("Demo 2 constructor called");
    }
    public void printname()
    {
        System.out.println("this file is aslo compiled");
    }
}
