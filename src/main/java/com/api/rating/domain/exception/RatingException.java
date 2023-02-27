package com.api.rating.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

/** The type Rating exception. */
@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class RatingException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 1L;

  private final transient String state;

  public RatingException(final String message, final String state) {
    super(message);
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
