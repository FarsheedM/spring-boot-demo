package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorldController {

    @GetMapping("greeting")
    public ResponseEntity<String> greeting(){
        return new ResponseEntity<>("hallo Welt",HttpStatus.OK);
    }


    @GetMapping("greeting/{name}")
    public ResponseEntity<String> greeting(@PathVariable String name){
        return new ResponseEntity<>("hallo "+ name,HttpStatus.OK);
    }
}
