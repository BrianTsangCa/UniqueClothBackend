package com.example.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Entity.Product;
import com.example.backend.Service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}
