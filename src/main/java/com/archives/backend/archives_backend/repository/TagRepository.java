package com.archives.backend.archives_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archives.backend.archives_backend.entity.Tag;


public interface TagRepository extends JpaRepository<Tag, Long> {

    Optional<Tag> findByName(String name);
    
}
