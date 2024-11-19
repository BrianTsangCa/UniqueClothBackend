package com.example.backend.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "invoices")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invoice_id")
	private int invoiceId;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "order_id", nullable = false)
	private Order order; // Assumes Order is another entity

	@Column(name = "invoice_date", nullable = false, updatable = false)
	private LocalDateTime invoiceDate;

	@Lob
	@Column(name = "details", nullable = false)
	private String details; // Stores JSON format as a string

	@PrePersist
	protected void onInvoiceCreation() {
		this.invoiceDate = LocalDateTime.now();
	}
}
