package com.educandoweb.course.service;


import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryService {


    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }


    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

}
