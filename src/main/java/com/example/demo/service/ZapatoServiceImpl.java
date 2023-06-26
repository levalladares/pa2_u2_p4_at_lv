package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ZapatoRepository;
import com.example.demo.repository.modelo.Zapato;

@Service
public class ZapatoServiceImpl implements ZapatoService{
	@Autowired
	private ZapatoRepository zapatoRepository;

	@Override
	public void fabricar(Zapato zapato) {
		// TODO Auto-generated method stub
		this.zapatoRepository.insertar(zapato);
	}

	@Override
	public Zapato validar(String codigoUnico) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarPorIDunico(codigoUnico);
	}

	@Override
	public List<Zapato> marcasDisponibles(String marca) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarListaPorMarca(marca);
	}

	@Override
	public Zapato preciosyMarcas(String marca, BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarPorMarcayPrecio(marca, precio);
	}

	@Override
	public Zapato buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarPorNombreTyped(nombre);
	}

	@Override
	public List<Zapato> fechaDeFabricacion(LocalDate fechaFabricacion) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarPorFecha(fechaFabricacion);
	}

}
