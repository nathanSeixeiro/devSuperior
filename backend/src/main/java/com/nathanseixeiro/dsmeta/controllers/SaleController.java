package com.nathanseixeiro.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathanseixeiro.dsmeta.entities.Sales;
import com.nathanseixeiro.dsmeta.services.SaleServices;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleServices service;

    @GetMapping
    public List<Sales> findSales(){
        return service.findSales();
    }
}
