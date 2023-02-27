package com.api.rating.domain.model.rating;

import static com.api.rating.application.handler.exception.CommonState.RECIPIENT_MUST_BE_REQUIRED;
import static com.api.rating.domain.model.ArgumentValidator.validateRequired;

public class RatingBookModel {

    private final Long ratingId;
    private final Long bookId;

    public RatingBookModel(Long ratingId, Long bookId) {
        validateRequired(
                ratingId,
                RECIPIENT_MUST_BE_REQUIRED.getMessage(),
                RECIPIENT_MUST_BE_REQUIRED.getCode());
        this.bookId = bookId;
        this.ratingId = ratingId;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public Long getBookId() {
        return bookId;
    }
}
