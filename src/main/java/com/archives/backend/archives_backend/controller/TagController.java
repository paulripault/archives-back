package com.archives.backend.archives_backend.controller;



import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.archives.backend.archives_backend.dto.TagDTO;
import com.archives.backend.archives_backend.service.TagService;

@RestController
@RequestMapping("/tags")
public class TagController {
    private final TagService service;

    public TagController(TagService service) {
        this.service = service;
    }

    @GetMapping
    public List<TagDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TagDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public TagDTO create(@RequestBody TagDTO tagDTO) {
        return service.create(tagDTO);
    }

    @PutMapping("/{id}")
    public TagDTO update(@PathVariable Long id, @RequestBody TagDTO tagDTO) {
        return service.update(id, tagDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
