package com.mugen.customexception.controller;

import com.mugen.customexception.exception.ApiEntityNotFoundException;
import com.mugen.customexception.exception.ApiRequestException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;




@RestController
@RequestMapping("/student")
public class StudentController {

    private static final Logger LOG = LogManager.getLogger(StudentController.class);

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

    @GetMapping("/logs")
    public String custom_logs_with_log4j2(){
        LOG.debug("debug log into student controller");
        LOG.info("info log into student controller");
        LOG.warn("warm log into student controller");
        LOG.error("error log into student controller");
        LOG.fatal("fatal log into student controller");
        return """
                End of my personal logs
                Check your console :)
                """;
    }
}
