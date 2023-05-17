package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String greetings(Model model) {
        model.addAttribute("username", "성빈");
        return "greetings"; // templates/greetings.mustache -> 브라우저 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "성빈");
        return "goodbye";
    }

}
