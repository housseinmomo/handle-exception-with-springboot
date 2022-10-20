package com.mugen.customexception.controller;

import com.mugen.customexception.exception.ApiRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/exception")
    public String throw_custom_exception(){
        throw new ApiRequestException("Mauvais URL");
       // return "My Exception";
    }
}
