package com.api.rating.infraestructure.adapter.dto.rating;

import com.api.rating.infraestructure.adapter.dto.book.BookDTO;

public class RatingBookDTO {

    public RatingBookDTO() {}

    public RatingBookDTO(BookDTO bookDTO, RatingDTO ratingDTO) {
        this.bookDTO = bookDTO;
        this.ratingDTO = ratingDTO;
    }

    private BookDTO bookDTO;
    private RatingDTO ratingDTO;

    public BookDTO getBookDTO() {
        return bookDTO;
    }

    public void setBookDTO(BookDTO bookDTO) {
        this.bookDTO = bookDTO;
    }

    public RatingDTO getRatingDTO() {
        return ratingDTO;
    }

    public void setRatingDTO(RatingDTO ratingDTO) {
        this.ratingDTO = ratingDTO;
    }
}
