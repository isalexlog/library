package com.library.library.service;

import com.library.library.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public boolean checkBookAvailability(Long bookId) {
        return !libraryRepository.findByBook_Id(bookId).isPresent();
    }
}
