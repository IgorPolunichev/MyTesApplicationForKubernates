package com.example.mytesapplicationforkubernates.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping ("/myFirstAppForKuber")
public class TestController {

    @GetMapping(value = "/helloWorld")
    public ResponseEntity<String> getHelloWorld(){
        System.out.println();
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping(value = "/shootDownThisApplication")
    public ResponseEntity<String> shootDownThisApp (){
        System.exit(200);
        return new ResponseEntity<>("Application is shoot down", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
