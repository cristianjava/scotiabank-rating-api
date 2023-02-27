package com.api.rating.infraestructure.adapter.entry.points.controller;

import com.api.rating.application.data.RatingBookData;
import com.api.rating.application.handler.RatingBookHandler;
import com.api.rating.infraestructure.adapter.dto.rating.RatingBookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RatingBookController {

    @Autowired
    private RatingBookHandler ratingBookHandler;

    @GetMapping("/ratingBooksFeign")
    public List<RatingBookDTO> findAllFeign() {
        return getRatingBookHandler().findAllFeign();
    }

    @GetMapping("/ratingBookFeign/{ratingId}")
    public RatingBookDTO findByIdFeign(@PathVariable Long ratingId) {
        return getRatingBookHandler().findByIdFeign(new RatingBookData(ratingId, null));
    }

    private RatingBookHandler getRatingBookHandler() {
        return ratingBookHandler;
    }
}
