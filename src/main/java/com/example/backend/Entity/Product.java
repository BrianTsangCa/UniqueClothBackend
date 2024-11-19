package com.example.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;

    private String name;
    private String description;
    private String category;
    private double price;
    private int stock;
    private String image_url;
    private String created_at;
    
}
