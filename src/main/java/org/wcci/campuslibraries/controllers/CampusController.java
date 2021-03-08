package org.wcci.campuslibraries.controllers;

import org.springframework.web.bind.annotation.*;
import org.wcci.campuslibraries.resources.Author;
import org.wcci.campuslibraries.resources.Book;
import org.wcci.campuslibraries.resources.Campus;
import org.wcci.campuslibraries.storage.AuthorRepository;
import org.wcci.campuslibraries.storage.BookRepository;
import org.wcci.campuslibraries.storage.CampusStorage;

@RestController
public class CampusController {

    private CampusStorage campusStorage;
    private BookRepository bookRepo;
    private AuthorRepository authorRepo;

    public CampusController(CampusStorage campusStorage, BookRepository bookRepo, AuthorRepository authorRepo) {
        this.campusStorage = campusStorage;
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }


}
