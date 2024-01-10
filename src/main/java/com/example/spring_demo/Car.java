package com.example.spring_demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vihicle{
    public void drive(){
        System.out.println("chal rhi hai");
    }
}
