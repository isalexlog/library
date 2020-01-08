package com.library.library.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class LibraryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private BookEntity book;

    @ManyToOne
    private UserEntity user;

}
