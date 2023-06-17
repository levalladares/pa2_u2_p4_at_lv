package com.example.demo.repository;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaRepository {

	public void insertar(CtaBancaria ctaBancaria);
	public void actualizar(Integer id);
	public CtaBancaria seleccionar(Integer id);
	public void eliminar(Integer id);
}
