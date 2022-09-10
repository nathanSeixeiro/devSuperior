package com.nathanseixeiro.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nathanseixeiro.dsmeta.entities.Sales;
import com.nathanseixeiro.dsmeta.repositories.SaleRepository;

@Service
public class SaleServices {

	@Autowired
	private SaleRepository repository;

	public Page<Sales> findSales(
			String minDate,
			String maxDate,
			Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = LocalDate.parse(minDate);
		LocalDate max = LocalDate.parse(maxDate);

		return repository.findSales(min, max, pageable);

	}
}
