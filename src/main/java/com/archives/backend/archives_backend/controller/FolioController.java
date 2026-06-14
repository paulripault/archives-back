package com.archives.backend.archives_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.archives.backend.archives_backend.dto.FolioDTO;
import com.archives.backend.archives_backend.service.FolioService;

@RestController
@RequestMapping("/folios")
public class FolioController {
    private final FolioService service;

    public FolioController(FolioService service) {
        this.service = service;
    }

    @GetMapping
    public List<FolioDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public FolioDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public FolioDTO create(@RequestBody FolioDTO folio) {
        return service.create(folio);
    }

    @PutMapping("/{id}")
    public FolioDTO update(@PathVariable Long id, @RequestBody FolioDTO folio) {
        return service.update(id, folio);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
