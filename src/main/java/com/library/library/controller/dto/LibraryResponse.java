package com.library.library.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LibraryResponse {
    private Long bookId;
    private Boolean available;
}
