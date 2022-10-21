package com.mugen.customexception.controller;

import com.mugen.customexception.exception.ApiEntityNotFoundException;
import com.mugen.customexception.exception.ApiRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/student")
public class StudentController {

    // c'est l'index, pas besoin de mettre / comme param au niveau de GetMapping()
    @GetMapping()
    public String home(){
        return "Hello Students";
    }

    @GetMapping("/exception")
    public String throw_custom_exception(){
        throw new ApiRequestException("Bad URL");
       // return "My Exception";
    }

    @GetMapping("{id}")
    public String getFirstStudent(@PathVariable("id") int id){
        throw new ApiEntityNotFoundException("Student with id " + id + " is not found");
    }
}
