package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/gaybys")
    public String gaybys(){
        return "GAYBÃO BIXOLÃO";
    }
}
