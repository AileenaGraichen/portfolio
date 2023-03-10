package web.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    //main page
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
