package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.LibroService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private LibroService  libroService;
	@Autowired
	private AutorService autorService ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Autor autor1 = new Autor();
		autor1.setNombre("Anthony");
		autor1.setApeliido("Vallades");
		
		Autor autor2 = new Autor();
		autor2.setNombre("Luis");
		autor2.setApeliido("Vallades");

		Autor autor3 = new Autor();
		autor3.setNombre("Jhon");
		autor3.setApeliido("Vallades");
		
		
		Set<Autor> conjuntoAutor= new HashSet<>();
		conjuntoAutor.add(autor1);
		conjuntoAutor.add(autor2);
		conjuntoAutor.add(autor3);
		
	
		//LIBROS
		Libro libro1 = new Libro();
		libro1.setTitulo("Caperucita");
		libro1.setEditorial("Norma");
	
		Libro libro2 = new Libro();
		libro2.setTitulo("XYZ");
		libro2.setEditorial("Norma");

		Libro libro3 = new Libro();
		libro3.setTitulo("El principito");
		libro3.setEditorial("Norma");
		
		Set<Libro> conjuntoLibros= new HashSet<>();
		conjuntoLibros.add(libro1);
		conjuntoLibros.add(libro2);
		conjuntoLibros.add(libro3);
		
		
		//Agregacion
		//autor1.setLibros(conjuntoLibros);
		//this.autorService.guardar(autor1);
		
		libro1.setAutores(conjuntoAutor);
		this.libroService.guardar(libro1);
		
		
		libro1.setTitulo("Harry Potter");
		this.libroService.actualizar(libro1);
		
		this.libroService.buscar(1);
		
		this.libroService.eliminar(1);
		
		
			
	}

}
