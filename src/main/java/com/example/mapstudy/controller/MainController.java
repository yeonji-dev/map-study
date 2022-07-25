package com.example.mapstudy.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
@Log4j2
public class MainController {

    @GetMapping("/kakaoMain")
    public void ex1(){
        log.info("kakaoMain...............");
    }
}
