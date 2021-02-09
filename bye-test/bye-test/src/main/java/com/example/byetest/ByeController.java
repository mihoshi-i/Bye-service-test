package com.example.byetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @Autowired
    private ByeService byeService;

    @GetMapping(value = "/bye")
    public void controller(){
        byeService.bye();


    }

}
