package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.type.descriptor.java.LocalDateJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Zapato;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.ZapatoService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private EstudianteService  estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("aaaaaaa");
		System.out.println(this.estudianteService.buscarPorApellidoNamed("Valladares"));
		
		System.out.println("bbbbbbb");
		System.out.println(this.estudianteService.buscarPorApellidoNamedQuey("Valladares"));
		
		System.out.println("ccccccc");
		System.out.println(this.estudianteService.buscarPorApellidoNativeQuery("Valladares"));
		
		System.out.println("ddddddd");
		System.out.println(this.estudianteService.buscarPorApellidoNativeQueryNamed("Valladares"));
		
		System.out.println("eeeeeee");
		System.out.println(this.estudianteService.buscarPorNombreNamedQuery("Luis"));
		
		System.out.println("ffffffff");
		System.out.println(this.estudianteService.buscarPorNombreNativeQueryNamed("luis"));
		
	}

}
