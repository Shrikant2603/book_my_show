package com.neebal.bookmyshow.controller;

import com.neebal.bookmyshow.entities.Theater;
import com.neebal.bookmyshow.services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MovieController {
    @Autowired
    private TheaterService theaterService;

    @RequestMapping(value = "/movies/{movieTitle}", method = RequestMethod.GET)
    public String showTheaters(@PathVariable("movieTitle") String movieTitle, Model model) {
        List<Theater> theaters = theaterService.getTheatersForMovie(movieTitle);
        model.addAttribute("theaters", theaters);
        return "theater";
    }

}
