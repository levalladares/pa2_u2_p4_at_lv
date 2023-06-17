package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.CtaBancaria;

public interface MontoAdicionalService {
	 
	public BigDecimal calcular(BigDecimal monto,CtaBancaria ctaBancaria);

}
