package com.example.jokeapp.controllers;

import com.example.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeServicel;

    @Autowired
    public JokeController(JokeService jokeServicel) {
        this.jokeServicel = jokeServicel;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeServicel.getJoke());
        return "chucknorris";
    }
}
