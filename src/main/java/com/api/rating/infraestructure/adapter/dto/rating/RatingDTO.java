package com.api.rating.infraestructure.adapter.dto.rating;


import jakarta.persistence.*;

@Entity
@Table(name = "rating_type")
public class RatingDTO {

    public RatingDTO() {}

    public RatingDTO(Long id, Long bookId, Integer stars) {
        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_id")
    private Long bookId;
    private Integer stars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
