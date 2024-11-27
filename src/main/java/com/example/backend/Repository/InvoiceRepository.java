package com.example.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.Entity.Invoice;
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}