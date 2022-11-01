package com.ezen.diary.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FrontController {

    @GetMapping("/")
    public String top(){
        return "top";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("join")
    public String join(){
        return "join";
    }

    @PostMapping("join_in")
    public String join_in(){
        
        return "main";
    }
}
