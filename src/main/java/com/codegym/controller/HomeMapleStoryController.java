package com.codegym.controller;

//import com.codegym.service.NewsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeMapleStoryController {

//    @Autowired
//    private NewsService newsService;

    @GetMapping("/home")
    public ModelAndView homeNews(){
        ModelAndView modelAndView = new ModelAndView("/news/home");
//        modelAndView.addObject("news",newsService.findAll(pageable));
        return modelAndView;
    }
}
