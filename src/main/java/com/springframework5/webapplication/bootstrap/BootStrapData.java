package com.springframework5.webapplication.bootstrap;

import com.springframework5.webapplication.domain.Author;
import com.springframework5.webapplication.domain.Book;
import com.springframework5.webapplication.domain.Publisher;
import com.springframework5.webapplication.repositories.AuthorRepository;
import com.springframework5.webapplication.repositories.BookRepository;
import com.springframework5.webapplication.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Develoment without EJB","3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in bootstrap");
        System.out.println("Number of Books:" + bookRepository.count());

        Publisher porrua = new Publisher("Librería de Porrúa Hermanos y Cía. S.A de C.V","República de Argentina 17, Centro","Cuauhtemoc","CDMX.","06800");

        publisherRepository.save(porrua);

        System.out.println("Number of publishers:" + publisherRepository.count());
    }
}
