package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping("/getARR")
    public String[] getArrayList() {
        return new String[] {"AAA", "BBB", "CCC"};
    }
}
