package com.bescalona.app;

import com.bescalona.model.Persona;

public class App {

	public static void main(String[] args) {
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Bescalona");
		per.setEdad(27);
		//System.out.println(per.getId()+" "+per.getNombre());
		System.out.println(per.toString());
	}
}
