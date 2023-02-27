package com.api.rating.infraestructure.adapter.entry.points.controller;

import com.api.rating.application.data.RatingData;
import com.api.rating.application.handler.RatingHandler;
import com.api.rating.infraestructure.adapter.dto.rating.RatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {

    @Autowired
    private RatingHandler ratingHandler;

    @GetMapping("/rating/{ratingId}")
    public RatingDTO findById(@PathVariable Long ratingId) {
        return getRatingHandler().findById(new RatingData(ratingId));
    }

    @GetMapping("/rating")
    public List<RatingDTO> findAll() {
        return getRatingHandler().findAll();
    }

    public RatingHandler getRatingHandler() {
        return ratingHandler;
    }
}
