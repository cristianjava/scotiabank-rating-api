package com.api.rating.domain.port.dao;

import com.api.rating.infraestructure.adapter.dto.book.BookDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "service-book")
public interface BookFeignDao {

    @GetMapping("/books")
    List<BookDTO> findAll();

    @GetMapping("/book/{bookId}")
    public BookDTO findById(@PathVariable Long bookId);
}
