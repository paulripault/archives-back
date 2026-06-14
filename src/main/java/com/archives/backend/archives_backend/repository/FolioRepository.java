package com.archives.backend.archives_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archives.backend.archives_backend.entity.Folio;
import com.archives.backend.archives_backend.entity.Manuscript;

public interface FolioRepository extends JpaRepository<Folio, Long> {

    Optional<Folio> findByManuscriptAndPageAndFolio(Manuscript manuscript, String page, String folio);

}
