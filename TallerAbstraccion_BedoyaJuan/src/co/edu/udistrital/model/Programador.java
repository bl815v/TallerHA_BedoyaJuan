package co.edu.udistrital.model;

public class Programador extends Empleado {
	private String lengProgDom;
	private float numLineasHora;
	
	public Programador(String nombre, int edad, String cedula, 
			String lengProgDom, float numLineasHora){
		
		super(nombre,edad, cedula);
		this.lengProgDom = lengProgDom;
		this.numLineasHora = numLineasHora;
		this.salario = 1500000;
		bonificacion();
	}
	
	@Override
	public void bonificacion() {
		if(numLineasHora >= 500.00 && numLineasHora < 1000.00)
			salario += salario * 0.2;
		if(numLineasHora >= 1000.00)
			salario += salario * 0.4;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nLenguaje de Programacion Dominante: " + lengProgDom +
				"\nNumero de Lineas de Codigo por hora: " + numLineasHora;
	}

	public String getLengProgDom() {
		return lengProgDom;
	}

	public void setLengProgDom(String lengProgDom) {
		this.lengProgDom = lengProgDom;
	}

	public float getNumLineasHora() {
		return numLineasHora;
	}

	public void setNumLineasHora(float numLineasHora) {
		this.numLineasHora = numLineasHora;
	}
	

}
