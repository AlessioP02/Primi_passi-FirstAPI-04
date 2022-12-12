package com.example.Primi_passiFirstAPI04.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping("/")
    public String request(@RequestHeader HttpHeaders headers){

        return headers.getHost().toString();

    }


}
