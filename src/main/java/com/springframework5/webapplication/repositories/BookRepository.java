package com.springframework5.webapplication.repositories;

import com.springframework5.webapplication.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
