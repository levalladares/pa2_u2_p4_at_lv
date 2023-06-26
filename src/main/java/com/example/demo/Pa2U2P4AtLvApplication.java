package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Zapato;
import com.example.demo.service.ZapatoService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private ZapatoService  zapatoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Zapato zap = new Zapato();
//		zap.setCodigoUnico("A001");
//		zap.setFechaFabricacion(LocalDate.now());
//		zap.setMarca("Nike");
//		zap.setNombre("Dunk");
//		zap.setPrecio(new BigDecimal(150));
//		this.zapatoService.fabricar(zap);
//		
//		Zapato zap2 = new Zapato();
//		zap2.setCodigoUnico("A002");
//		zap2.setFechaFabricacion(LocalDate.now());
//		zap2.setMarca("Nike");
//		zap2.setNombre("Jordan1");
//		zap2.setPrecio(new BigDecimal(200));
//		this.zapatoService.fabricar(zap2);
//		
//		Zapato zap3 = new Zapato();
//		zap3.setCodigoUnico("AE03");
//		zap3.setFechaFabricacion(LocalDate.now());
//		zap3.setMarca("Nike");
//		zap3.setNombre("AirForce1");
//		zap3.setPrecio(new BigDecimal(100));
//		this.zapatoService.fabricar(zap3);
//		
//		Zapato zap4 = new Zapato();
//		zap4.setCodigoUnico("AEZ4");
//		zap4.setFechaFabricacion(LocalDate.now());
//		zap4.setMarca("Adidas");
//		zap4.setNombre("Superstar");
//		zap4.setPrecio(new BigDecimal(130));
//		this.zapatoService.fabricar(zap4);
		
		System.out.println(">>>>>Query.getSingleResult");
		System.out.println(this.zapatoService.validar("AEZ4"));
		
		System.out.println(">>>>>Query.getResultList");
		System.out.println(this.zapatoService.marcasDisponibles("Nike"));
		
		System.out.println(">>>>>por dos atributos");
		System.out.println(this.zapatoService.preciosyMarcas("Nike", new BigDecimal(100)));
		
		System.out.println(">>>>>Query.getSingleResultTyped");
		System.out.println(this.zapatoService.buscarPorNombre("Dunk"));
		
		System.out.println(">>>>>Query.getResultListTyped");
		System.out.println(this.zapatoService.fechaDeFabricacion(LocalDate.now()));
	}

}
