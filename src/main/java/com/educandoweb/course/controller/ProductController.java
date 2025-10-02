package com.educandoweb.course.controller;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtcs")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product products = productService.findById(id);
        return ResponseEntity.ok().body(products);
    }


}
