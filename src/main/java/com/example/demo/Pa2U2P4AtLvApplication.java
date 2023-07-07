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
		
		Zapato zap1 =new  Zapato();
		zap1.setMarca("Nike");
		zap1.setNombre("AirForce 1");
		zap1.setPrecio(new BigDecimal(150));
		zap1.setCodigoUnico("Afsasdq001");
		zap1.setFechaFabricacion(LocalDate.of(2022, 02, 25));
		zap1.setTalla("9.5US");
		//this.zapatoService.fabricar(zap1);
		
		Zapato zap2 =new  Zapato();
		zap2.setMarca("Nike");
		zap2.setNombre("Jordan 1");
		zap2.setPrecio(new BigDecimal(200));
		zap2.setCodigoUnico("J1asdasjhb001");
		zap2.setFechaFabricacion(LocalDate.of(2022, 8, 25));
		zap2.setTalla("7US");
		//this.zapatoService.fabricar(zap2);
		
		Zapato zap3 =new  Zapato();
		zap3.setMarca("Nike");
		zap3.setNombre("AirForce 1");
		zap3.setPrecio(new BigDecimal(95));
		zap3.setCodigoUnico("Afsasdq001");
		zap3.setFechaFabricacion(LocalDate.of(2022, 02, 25));
		zap3.setTalla("11US");
		//this.zapatoService.fabricar(zap3);
		
		Zapato zap4 =new  Zapato();
		zap4.setMarca("Adidas");
		zap4.setNombre("Superstars");
		zap4.setPrecio(new BigDecimal(80));
		zap4.setCodigoUnico("SSasdgas878");
		zap4.setFechaFabricacion(LocalDate.of(2023, 02, 11));
		zap4.setTalla("8US");
		//this.zapatoService.fabricar(zap4);
		
		
		//Metodo Dinamico
		System.out.println("Busca Dinamica");
		System.out.println(this.zapatoService.BuscarPorNomnbreDinamico("AirForce 1", new BigDecimal(100), "Adidas"));
		
	}

}
