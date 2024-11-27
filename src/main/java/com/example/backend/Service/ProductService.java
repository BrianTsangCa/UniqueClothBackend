package com.example.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.Entity.Product;
import com.example.backend.Entity.ProductStatus;
import com.example.backend.Repository.ProductRepository;

@Service
public class ProductService {
	
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getProducts() {
        return productRepository.findAllByStatus(ProductStatus.LISTED);
    }
    
}
