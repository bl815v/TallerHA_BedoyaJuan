package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {
	private Scanner leer;
	
	public VistaConsola() {
		leer = new Scanner(System.in);
	}
	
	public String leerDato(String mensaje) {
		System.out.print(mensaje);
		String dato = leer.nextLine();
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
	
}
