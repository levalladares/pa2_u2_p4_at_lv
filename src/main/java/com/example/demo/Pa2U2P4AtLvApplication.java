package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private EstudianteService  estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Estudiante estu= new Estudiante();
		estu.setApellido("Valladares");
		estu.setCedula("1564651313");
		estu.setNombre("Luis");
		this.estudianteService.guardar(estu);
		
		Estudiante estu2= new Estudiante();
		estu2.setApellido("Bastidas");
		estu2.setCedula("1785248759");
		estu2.setNombre("Ernesto");
		this.estudianteService.guardar(estu2);
		
		Estudiante estu3= new Estudiante();
		estu3.setApellido("Bastidas");
		estu3.setCedula("17852487592");
		estu3.setNombre("Ernesto");
		this.estudianteService.guardar(estu3);
		
		Estudiante estu4= new Estudiante();
		estu4.setApellido("Bastidas");
		estu4.setCedula("17852487593");
		estu4.setNombre("Ernesto");
		this.estudianteService.guardar(estu4);*/
		
		System.out.println("buscar solo un dato que no se repite Query.getSingleResult>>");
		System.out.println(this.estudianteService.buscarPorApellido("Valladares"));
		System.out.println("buscar una lista  lista Query.getResultList>>");
		System.out.println(this.estudianteService.generarReporte("Bastidas"));
		System.out.println("buscar por dos atributos");
		System.out.println(this.estudianteService.buscarPorApellidoyNombre("Valladares","Luis"));
		System.out.println("TypedQuery>>getSingleResult");
		System.out.println(this.estudianteService.buscarPorApellidoTyped("Valladares"));
	
		
		
		
		
			
	}

}
