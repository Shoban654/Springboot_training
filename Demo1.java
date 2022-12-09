package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Demo1 {
    @Autowired
    @Qualifier("demo2")
    Demo2 demo_ranDemo2;
    // Demo2 demo3;
    public Demo1(){
        System.out.println("Demo 1 constructor called");
    }
    public void printname()
    {
        System.out.println("this file is compiled");
    }
    
}
