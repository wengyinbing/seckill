package com.weng.seckill.controller;

import com.weng.seckill.generator.model.Seckill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class testController {

    @GetMapping("/hello1")
    public String greetingForm(Model model) {

        model.addAttribute("greeting", new Seckill());

        return "hello1.html";

    }


    @RequestMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Seckill greeting) {

        return "result.html";

    }


}
