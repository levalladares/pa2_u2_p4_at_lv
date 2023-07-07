package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Zapato;

public interface ZapatoService {
	public void fabricar(Zapato zapato);
	public Zapato validar(String codigoUnico);
	public  List<Zapato> marcasDisponibles(String marca);
	public Zapato preciosyMarcas(String marca,BigDecimal precio);
	public Zapato buscarPorNombre(String nombre);
	public  List<Zapato> fechaDeFabricacion(LocalDate fechaFabricacion);
	public int actualizarTallayPrecio(String nombre, String talla, BigDecimal precio);
	public int eliminarPorNombreyMarca(String nombre, String marca);
}
