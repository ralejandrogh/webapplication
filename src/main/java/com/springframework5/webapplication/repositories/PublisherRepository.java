package com.springframework5.webapplication.repositories;

import com.springframework5.webapplication.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
