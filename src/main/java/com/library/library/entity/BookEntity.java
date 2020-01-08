package com.library.library.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class BookEntity {

    @Id
    @GeneratedValue
    private Long id;
}
