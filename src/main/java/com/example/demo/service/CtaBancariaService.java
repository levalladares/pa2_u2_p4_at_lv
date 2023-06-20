package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaService {

	
	public void aperturar(CtaBancaria ctaBancaria);
	public void actualizar(CtaBancaria ctaBancaria);
	public void consultar(Integer id);
	public void eliminar(Integer id);

}
