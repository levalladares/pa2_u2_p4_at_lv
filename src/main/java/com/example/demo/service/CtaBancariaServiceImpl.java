package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CtaBancariaRepository;
import com.example.demo.repository.modelo.CtaBancaria;
@Service
public class CtaBancariaServiceImpl implements CtaBancariaService {

	@Autowired
	private CtaBancariaRepository bancariaRepository;
	
	@Autowired
	@Qualifier("aumenta")
	private MontoAdicionalService adicionalService;
	
	@Override
	public void aperturar(CtaBancaria ctaBancaria) {
	this.bancariaRepository.insertar(ctaBancaria);
	BigDecimal montoAd = this.adicionalService.calcular(ctaBancaria.getSaldo(), ctaBancaria);
	
		
	}

	@Override
	public void actualizar(Integer id) {
		
		this.bancariaRepository.actualizar(id);
	}

	@Override
	public void consultar(Integer id) {
		// TODO Auto-generated method stub
		this.bancariaRepository.seleccionar(id);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.bancariaRepository.eliminar(id);
		
	}

}
