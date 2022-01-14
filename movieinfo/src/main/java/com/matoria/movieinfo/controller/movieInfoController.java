package com.matoria.movieinfo.controller;

import com.matoria.movieinfo.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieInfo")
public class movieInfoController {

    @RequestMapping("/{movieId}")
    public Movie getMovieDetails(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, "Thriller");
    }
}
