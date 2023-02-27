package com.api.rating.application.handler;

import com.api.rating.application.data.RatingBookData;
import com.api.rating.application.factory.RatingBookFactory;
import com.api.rating.domain.model.rating.RatingBookModel;
import com.api.rating.domain.service.RatingBookService;
import com.api.rating.infraestructure.adapter.dto.rating.RatingBookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RatingBookHandler {

    @Autowired
    private RatingBookFactory ratingBookFactory;
    @Autowired
    private RatingBookService ratingBookService;

    private RatingBookFactory getRatingBookFactory() {
        return ratingBookFactory;
    }

    private RatingBookService getRatingBookService() {
        return ratingBookService;
    }

    @Transactional(readOnly = true)
    public RatingBookDTO findByIdFeign(RatingBookData ratingBookData) {
        RatingBookModel ratingBookModel = getRatingBookFactory().create(ratingBookData);
        return getRatingBookService().findByIdFeign(ratingBookModel.getRatingId());
    }

    @Transactional(readOnly = true)
    public List<RatingBookDTO> findAllFeign() {
        return getRatingBookService().findAllFeign();
    }

}
