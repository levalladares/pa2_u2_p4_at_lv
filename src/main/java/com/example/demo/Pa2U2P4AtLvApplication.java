package com.example.demo;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private CiudadanoService ciudadanoService;
	@Autowired
	private EmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ciudadano ciu = new Ciudadano();
		ciu.setNombre("Luis Anthony");
		ciu.setApellido("Tipan Valladareszzz");
		ciu.setCedula("1245789");
		this.ciudadanoService.agregar(ciu);
		
		Ciudadano ciu2 = new Ciudadano();
		ciu2.setNombre("Luis Anthony");
		ciu2.setApellido("Tipan TIPAN");
		ciu2.setCedula("1245787779");
		//this.ciudadanoService.agregar(ciu2);
		
		Empleado emp = new Empleado();
		emp.setCiudadano(ciu2);
		emp.setCargo("Bodeguero");
		emp.setSueldo(new BigDecimal(400));
		
		ciu2.setEmpleado(emp);
		//this.ciudadanoService.agregar(ciu);      <<<<>>>> FALLA
		this.empleadoService.agregar(emp);
		
	}

}
