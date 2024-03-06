package com.mymovieproject.controller;

import com.mymovieproject.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String showMovieList(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "movieList"; // Returns the movieList.html template
    }
}
