package com.neebal.bookmyshow.controller;

import com.neebal.bookmyshow.entities.Movie;
import com.neebal.bookmyshow.entities.User;
import com.neebal.bookmyshow.repositories.MovieRepository;
import com.neebal.bookmyshow.services.MasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class WelcomeController {
    @Autowired
    private MasterDataService masterDataService;

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String showWelcomePage(Model model){
        List<Movie> movies = movieRepository.findAll();
        //System.out.println(movies.get(0).getTitle());
        model.addAttribute("movies", movies);
        return "welcome";
    }



}
