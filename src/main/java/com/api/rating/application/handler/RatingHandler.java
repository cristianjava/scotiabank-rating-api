package com.api.rating.application.handler;

import com.api.rating.application.data.RatingData;
import com.api.rating.application.factory.RatingFactory;
import com.api.rating.domain.model.rating.RatingModel;
import com.api.rating.domain.service.RatingService;
import com.api.rating.infraestructure.adapter.dto.rating.RatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RatingHandler {

    @Autowired
    private RatingFactory ratingFactory;
    @Autowired
    private RatingService ratingService;

    @Transactional(readOnly = true)
    public RatingDTO findById(RatingData ratingData) {
        RatingModel ratingTypeDTO = getRatingFactory().create(ratingData);
        return getRatingService().findById(ratingTypeDTO.getRatingId());
    }

    @Transactional(readOnly = true)
    public List<RatingDTO> findAll() {
        return getRatingService().findAll();
    }

    private RatingFactory getRatingFactory() {
        return ratingFactory;
    }

    private RatingService getRatingService() {
        return ratingService;
    }
}
