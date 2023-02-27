package com.api.rating.domain.service;

import com.api.rating.domain.port.dao.BookFeignDao;
import com.api.rating.infraestructure.adapter.dao.RatingDaoJPA;
import com.api.rating.infraestructure.adapter.dto.rating.RatingBookDTO;
import com.api.rating.infraestructure.adapter.dto.rating.RatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingBookService {

    @Autowired
    private BookFeignDao bookFeignDao;
    @Autowired
    private RatingDaoJPA ratingDaoJPA;

    private BookFeignDao getBookFeignDao() {
        return bookFeignDao;
    }

    private RatingDaoJPA getRatingDaoJPA() {
        return ratingDaoJPA;
    }

    @Transactional(readOnly = true)
    public List<RatingBookDTO> findAllFeign() {
        List<RatingDTO> ratingDTOList = (List<RatingDTO>) getRatingDaoJPA().findAll();
        return ratingDTOList.stream().map(ratingDTO -> new RatingBookDTO(
                getBookFeignDao().findById(ratingDTO.getBookId()),
                ratingDTO)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public RatingBookDTO findByIdFeign(Long ratingId) {
        return getRatingDaoJPA().findById(ratingId).map(ratingDTO -> new RatingBookDTO(
                getBookFeignDao().findById(ratingDTO.getBookId()),
                ratingDTO
        )).orElse(null);

        //BookDTO bookDTO = getBookFeignDao().findById(bookId);
        //RatingDTO ratingTypeDTO = getRatingDaoJPA().findById(bookDTO.getRatingId()).orElse(null);
        //return new RatingBookDTO(bookDTO, ratingTypeDTO);
    }

}
