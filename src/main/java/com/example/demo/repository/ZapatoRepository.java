package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import com.example.demo.repository.modelo.Zapato;

public interface ZapatoRepository {
	
	public void insertar(Zapato zapato);
	
	public Zapato seleccionarPorIDunico(String codigoUnico);
	public  List<Zapato> seleccionarListaPorMarca(String marca);
	public Zapato seleccionarPorMarcayPrecio(String marca,BigDecimal precio);
	public Zapato seleccionarPorNombreTyped(String nombre);
	public  List<Zapato> seleccionarPorFecha(LocalDate fechaFabricacion);
	public int actualizarPorTallayPrecio(String nombre,String talla,BigDecimal precio);
	public int eliminarPorNombreyMarca(String nombre,String marca);


}
