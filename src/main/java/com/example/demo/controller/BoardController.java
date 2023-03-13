package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board") //대표주소
public class BoardController {
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }
}
