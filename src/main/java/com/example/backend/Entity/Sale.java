package com.example.backend.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sale_id")
	private int saleId;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "order_id", nullable = false)
	private Order order; // Assumes Order is another entity

	@Column(name = "sale_amount", nullable = false, precision = 10, scale = 2)
	private double saleAmount;

	@Column(name = "sale_date", nullable = false, updatable = false)
	private LocalDateTime saleDate;

	@PrePersist
	protected void onSaleCreation() {
		this.saleDate = LocalDateTime.now();
	}
}
