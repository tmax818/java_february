package com.tyler.session_demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index(HttpSession session){
        return "index.jsp";
    }

    @PostMapping("/surveys")
    public String surveys(@RequestParam("name")String name,
    @RequestParam("location") String location, HttpSession session)
 {
        System.out.println(name);
        session.setAttribute("name", name);
        session.setAttribute("location", location);
        return "redirect:/display";
    }

    @RequestMapping("/display")
    public String display(){
        return "display.jsp";
    }
}
