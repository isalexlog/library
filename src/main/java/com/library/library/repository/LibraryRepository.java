package com.library.library.repository;

import com.library.library.entity.LibraryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibraryRepository extends CrudRepository<LibraryEntity, Long> {

    Optional<LibraryEntity> findByBook_Id(Long book_id);

}
