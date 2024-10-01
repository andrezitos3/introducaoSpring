package com.grupo.first_spring_app.services;

import org.springframework.stereotype.Service;;

@Service
public class HelloWorldService {

        public String helloWorld(String name){
            return "hello world " + name;
        }
}
