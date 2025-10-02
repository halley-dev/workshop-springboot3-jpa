package com.educandoweb.course.service;


import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final  ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> optional = productRepository.findById(id);
       return optional.get();
    }


}
