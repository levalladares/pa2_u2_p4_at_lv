package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.CtaBancaria;

public class MontoAdicionalNoAumentaImpl implements MontoAdicionalService {

	@Override
	public BigDecimal calcular(BigDecimal monto, CtaBancaria ctaBancaria) {
		// TODO Auto-generated method stub
	        System.out.println("El día es impar");
		return ctaBancaria.getSaldo();
	}

}
