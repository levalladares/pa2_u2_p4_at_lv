package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CuidadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private CuidadanoService  cuidadanoService;
	@Autowired
	private EmpleadoService empleadoService ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setNombre("Anthony");
		ciudadano1.setApellido("Tipan");
		ciudadano1.setCedula("1345");
		
		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setNombre("Luis");
		ciudadano2.setApellido("xyz");
		ciudadano2.setCedula("5678");
		
		Empleado empleado1 = new Empleado();
		empleado1.setCargo("Gerente ");
		empleado1.setSueldo(new BigDecimal(500));
		empleado1.setCiudadano(ciudadano1);
		
		Empleado empleado2 = new Empleado();
		empleado2.setCargo("Bodegero ");
		empleado2.setSueldo(new BigDecimal(500));
		empleado2.setCiudadano(ciudadano2);
		
		
		ciudadano1.setEmpleado(empleado1);
		ciudadano2.setEmpleado(empleado2);
		//this.cuidadanoService.guardar(ciudadano1);
		this.empleadoService.guardar(empleado1);
		//this.cuidadanoService.guardar(ciudadano2);
		this.empleadoService.guardar(empleado2);
		
		
		ciudadano2.setApellido("Valladares");
		this.cuidadanoService.actualizar(ciudadano2);
		
		this.cuidadanoService.buscar(30);
		
		this.cuidadanoService.eliminar(30);
		

			
	}

}
