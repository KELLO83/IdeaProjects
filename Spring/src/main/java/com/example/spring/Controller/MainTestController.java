package com.example.spring.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainTestController {

    @GetMapping("home")
    public String home(Model model){
        model.addAttribute("data","어서오세요!");
        return "index";
    }
}
