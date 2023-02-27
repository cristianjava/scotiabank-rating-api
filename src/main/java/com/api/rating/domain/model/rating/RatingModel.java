package com.api.rating.domain.model.rating;

import static com.api.rating.application.handler.exception.CommonState.RECIPIENT_MUST_BE_REQUIRED;
import static com.api.rating.domain.model.ArgumentValidator.validateRequired;

public class RatingModel {

    private final Long ratingId;

    public RatingModel(Long ratingId) {
        validateRequired(
                ratingId,
                RECIPIENT_MUST_BE_REQUIRED.getMessage(),
                RECIPIENT_MUST_BE_REQUIRED.getCode());
        this.ratingId = ratingId;
    }

    public Long getRatingId() {
        return ratingId;
    }
}
