package com.api.rating.domain.service;

import com.api.rating.infraestructure.adapter.dao.RatingDaoJPA;
import com.api.rating.infraestructure.adapter.dto.rating.RatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingDaoJPA ratingDaoJPA;

    private RatingDaoJPA getRatingDaoJPA() {
        return ratingDaoJPA;
    }

    @Transactional(readOnly = true)
    public List<RatingDTO> findAll() {
        return (List<RatingDTO>) getRatingDaoJPA().findAll();
    }

    @Transactional(readOnly = true)
    public RatingDTO findById(Long id) {
        return getRatingDaoJPA().findById(id).orElse(null);
    }

}
