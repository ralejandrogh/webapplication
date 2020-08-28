package com.springframework5.webapplication.repositories;

import com.springframework5.webapplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
