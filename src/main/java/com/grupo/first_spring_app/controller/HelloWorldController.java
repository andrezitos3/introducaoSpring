package com.grupo.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.first_spring_app.domain.User;
import com.grupo.first_spring_app.services.HelloWorldService;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
    

    @Autowired
    private HelloWorldService service;

    @GetMapping
    public String helloWorld(){
        return service.helloWorld("Andre");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "hello world " +  body.getName() + id + filter;
    }

}
