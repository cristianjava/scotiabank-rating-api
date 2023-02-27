package com.api.rating.application.data;

public class RatingBookData {

  private Long ratingId;
  private Long bookId;

	public RatingBookData(Long ratingId, Long bookId) {
		this.ratingId = ratingId;
		this.bookId = bookId;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public Long getBookId() {
		return bookId;
	}
}
