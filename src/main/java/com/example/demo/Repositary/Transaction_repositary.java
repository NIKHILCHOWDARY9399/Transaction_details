


package com.example.demo.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Transaction;


public interface Transaction_repositary
        extends JpaRepository<Transaction, Long> {
	
	List<Transaction> findByStatus(String status);

	List<Transaction> findByAccountNumber(String accountNumber);

}
