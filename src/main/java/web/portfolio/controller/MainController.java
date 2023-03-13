package web.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    //main page
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("/projects")
    public String projects(){
        return "projects";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
