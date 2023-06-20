package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U2P4AtLvApplication implements CommandLineRunner {
	
	@Autowired
	private HotelService  hotelService;
	@Autowired
	private HabitacionService habitacionService ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		/*Hotel hotel1= new Hotel ();
		hotel1.setDireccion("Quito");
		hotel1.setNombre("Risol");*/
		//this.hotelService.guardar(hotel1);
		
		Hotel hotel2= new Hotel ();
		hotel2.setDireccion("Sangolqui");
		hotel2.setNombre("Hotel Y");
		
		
		Habitacion hab1= new Habitacion();
		hab1.setNumero("01");
		hab1.setValor(new  BigDecimal(30));
		//hab1.setHotel(hotel1);
		//this.habitacionService.guardar(hab1);
		
		Habitacion hab2= new Habitacion();
		hab2.setNumero("02");
		hab2.setValor(new  BigDecimal(30));
		//hab2.setHotel(hotel1);
		//this.habitacionService.guardar(hab2);
		
		Habitacion hab3= new Habitacion();
		hab3.setNumero("03");
		hab3.setValor(new  BigDecimal(35));
		//hab3.setHotel(hotel1);
		//this.habitacionService.guardar(hab3);
		
		List<Habitacion>lista=new ArrayList<>();
		lista.add(hab1);
		lista.add(hab2);
		lista.add(hab3);
		
		
		
		Hotel hotel1= new Hotel ();
		hotel1.setDireccion("Quito");
		hotel1.setNombre("Risol");
		hotel1.setHabitaciones(lista);
		
		hab1.setHotel(hotel1);
		hab2.setHotel(hotel1);
		hab3.setHotel(hotel1);
		this.hotelService.guardar(hotel1);
		
		hotel1.setNombre("ABCD");
		this.hotelService.actualizar(hotel1);
		
		this.habitacionService.eliminar(4);

		
		
		
			
	}

}
