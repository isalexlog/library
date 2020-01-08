package com.library.library.controller;

import com.library.library.controller.dto.LibraryResponse;
import com.library.library.service.LibraryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping(path = "/availability/book/{bookId}")
    public LibraryResponse checkBookAvailability(@PathVariable Long bookId) {
        return new LibraryResponse(bookId, libraryService.checkBookAvailability(bookId));
    }
}
