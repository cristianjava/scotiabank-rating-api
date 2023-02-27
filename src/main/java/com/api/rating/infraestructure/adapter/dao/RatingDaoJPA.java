package com.api.rating.infraestructure.adapter.dao;

import com.api.rating.infraestructure.adapter.dto.rating.RatingDTO;
import org.springframework.data.repository.CrudRepository;

public interface RatingDaoJPA extends CrudRepository<RatingDTO, Long> {

}
