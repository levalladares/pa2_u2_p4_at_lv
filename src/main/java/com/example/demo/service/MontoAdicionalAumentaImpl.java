package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CtaBancariaRepository;
import com.example.demo.repository.modelo.CtaBancaria;
@Service("aumenta")
public class MontoAdicionalAumentaImpl implements MontoAdicionalService {
	@Autowired
	private CtaBancariaRepository bancariaRepository;

	@Override
	public BigDecimal calcular(BigDecimal monto,CtaBancaria ctaBancaria) {
		// TODO Auto-generated method stub
	       // System.out.println("El día es par");
	        monto =ctaBancaria.getSaldo().multiply(new BigDecimal(1.05));
	        ctaBancaria.setSaldo(monto);
		return monto;
	}

}
