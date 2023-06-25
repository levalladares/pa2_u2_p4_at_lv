package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private MatriculaService  matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		List<Matricula> listaM = new ArrayList<>();
		
		Materia mat = new Materia();
		mat.setNombre("Redes");
		mat.setMatricula(listaM);

		
		Alumno alum = new Alumno();
		alum.setNombre("Luis");
		
		Matricula matri = new Matricula();
		matri.setMateria(mat);
		matri.setAlumno(alum);
		matri.setFecha(LocalDateTime.now());
		matri.setNumero("001");
		
		this.matriculaService.guardar(matri, alum, mat);
		
		
		
			
	}

}
