package com.example.backend.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int product_id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "description", length = 500)
	private String description;

	@Column(name = "category", nullable = false, length = 50)
	private String category;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "stock", nullable = false)
	private int stock;

	@Column(name = "image_url", length = 255)
	private String image_url;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	private ProductStatus status;

	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime created_at;

}
