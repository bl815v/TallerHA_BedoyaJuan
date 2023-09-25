package co.edu.udistrital.controller;

import co.edu.udistrital.model.*;
import co.edu.udistrital.view.*;

public class Controller {
	//private VistaConsola vista;
	private VistaEmergente vista;
	
	public Controller() {
		//vista = new VistaConsola();
		vista = new VistaEmergente();
		funcionar();
	}
	
	public void funcionar() {
		vista.mostrarInformacion("PROGRAMA DE DATOS EMPLEADOS");
		int cantidad = Integer.parseInt(vista.leerDato("Digite la cantidad de Empleados a registrar: "));
		while(cantidad < 0)
			cantidad = Integer.parseInt(vista.leerDato("\nError: Digite la cantidad de Empleados a registrar: "));
		Empleado[] p = new Empleado[cantidad];
		
		String nombre, cedula, lengProgDom, areaEnc;
		int edad, yearsExp, developTeams;
		float numLineasHora;
		String menu = "\nMenu de opciones: " + 
						"\n\t1. Programador " + 
						"\n\t2. Consultor " + 
						"\n\t3. Directivo " +
						"\n\t4. Salir" + 
						"\n\tDigite opcion: ";
		
		for(int i = 0; i < p.length; i++) {
			String opcion = vista.leerDato(menu);
			if(opcion.contentEquals("4")) {
		    	vista.mostrarInformacion("Hasta Pronto! :)");
		    	i = p.length;
			}
			else {
				nombre = vista.leerDato("\nEscriba el nombre: ");
				edad = Integer.parseInt(vista.leerDato("\nEscriba la edad: "));
				while(edad <= 0 || edad > 150)
					edad = Integer.parseInt(vista.leerDato("\nError: escriba una edad valida: "));
				cedula = vista.leerDato("\nEscriba la cedula: ");
				
				switch (opcion) { 
				    case "1":
				    	lengProgDom = vista.leerDato("\nEscriba el Lenguaje de Programacion Dominante: ");
				    	numLineasHora = Float.parseFloat(vista.leerDato("\nEscriba el Numero de Lineas de Codigo por hora: "));
				    	Empleado b = new Programador(nombre, edad, cedula, lengProgDom, numLineasHora);
				    	p[i] = b;
				    	break;
				    case "2":
				    	yearsExp = Integer.parseInt(vista.leerDato("\nEscriba los Annos de Experiencia: "));
				    	while(yearsExp < 0)
				    		yearsExp = Integer.parseInt(vista.leerDato("\nError: escriba los Annos de Experiencia: "));
				    	developTeams = Integer.parseInt(vista.leerDato("\nEscriba los Equipos de Desarrollo Liderados: "));
				    	while(developTeams < 0)
				    		developTeams = Integer.parseInt(vista.leerDato("\nError: escriba los Equipos de Desarrollo Liderados: "));
				    	Empleado c = new Consultor(nombre, edad, cedula, yearsExp, developTeams);
				    	p[i] = c;
				    	break;
				    case "3":
				    	yearsExp = Integer.parseInt(vista.leerDato("\nEscriba los Annos de Experiencia: "));
				    	while(yearsExp < 0)
				    		yearsExp = Integer.parseInt(vista.leerDato("\nError: escriba los Annos de Experiencia: "));
				    	areaEnc = vista.leerDato("\nEscriba el Area encargada: ");
				    	Empleado d = new Directivo(nombre, edad, cedula, yearsExp, areaEnc);
				    	p[i] = d;
				    	break;
				    default:
				    	vista.mostrarInformacion("Error: Opcion invalida");
				    	break;
				    	
				}
			}
		}
		
		for(int i = 0; i < p.length; i++) {
			System.out.println("___________________________________________________________________");
			System.out.println(p[i]);
		}
		System.out.println("___________________________________________________________________");
		
		
	}
}
