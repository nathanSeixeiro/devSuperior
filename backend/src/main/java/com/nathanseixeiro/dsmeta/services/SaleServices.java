package com.nathanseixeiro.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanseixeiro.dsmeta.entities.Sales;
import com.nathanseixeiro.dsmeta.repositories.SaleRepository;

@Service
public class SaleServices {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sales> findSales() {
		return repository.findAll();
		
	}
}
