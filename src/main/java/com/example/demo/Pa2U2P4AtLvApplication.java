package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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
	private HotelService hotelService;
	@Autowired
	private HabitacionService habitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AtLvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Ciudadano ciu = new Ciudadano();
		ciu.setNombre("Luis Anthony");
		ciu.setApellido("Tipan Valladareszzz");
		ciu.setCedula("1245789");
		this.ciudadanoService.agregar(ciu); //>>>>>>>>> se agrega solo el ciudadano
		
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
		this.empleadoService.agregar(emp);  //>>>>>>>>> se agrega el ciudadano desde el empleado
		*/
		
		Hotel hot = new Hotel();
		hot.setNombre("Hotel X");
		hot.setDireccion("Av. 10 DE AGOSTO");
		//this.hotelService.construir(hot);
		
		Hotel hot2 = new Hotel();
		hot2.setNombre("Hotel Y");
		hot2.setDireccion("Av. AMERICA");
		
		Hotel hot3 = new Hotel();
		hot3.setNombre("Hotel l");
		hot3.setDireccion("Av. ABC");
		
		Hotel hot4 = new Hotel();
		hot4.setNombre("Hotel AAA");
		hot4.setDireccion("Av. AAA");
		
		Habitacion hab = new Habitacion();
		hab.setNumero("01");
		hab.setValor(new BigDecimal(20));
		hab.setHotel(hot4);
		//this.habitacionService.agregar(hab);
		
		Habitacion hab2 = new Habitacion();
		hab2.setNumero("02");
		hab2.setValor(new BigDecimal(30));
		hab2.setHotel(hot4);
		//this.habitacionService.agregar(hab2);
		
		Habitacion hab3 = new Habitacion();
		hab3.setNumero("03");
		hab3.setValor(new BigDecimal(40));
		hab3.setHotel(hot4);
		//this.habitacionService.agregar(hab3);
		
		List<Habitacion> lista = new ArrayList<>();
		lista.add(hab3);
        lista.add(hab2);
        lista.add(hab);
        hot4.setHabitaciones(lista);
		
		this.habitacionService.agregar(hab);
		this.habitacionService.agregar(hab2);
		this.habitacionService.agregar(hab3);
		
		
		//hot.setHabitaciones(Arrays.asList(hab, hab2, hab3));
		//this.habitacionService.agregar(hab);
		//this.habitacionService.agregar(hab2);
		//this.habitacionService.agregar(hab3);
		//this.hotelService.construir(hot);
		
		/*this.habitacionService.eliminar(7);
		this.habitacionService.eliminar(8);
		this.habitacionService.eliminar(9);
		this.hotelService.eliminar(4);
		this.habitacionService.eliminar(11);
		this.hotelService.eliminar(5);*/
		
	}

}
