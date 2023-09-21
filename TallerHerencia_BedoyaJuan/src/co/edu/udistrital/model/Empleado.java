package co.edu.udistrital.model;

public class Empleado {
	protected String nombre, cedula;
	protected int edad;
	protected double salario;
	
	public Empleado(String nombre, int edad, String cedula, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.salario = salario;
		aumentarSalario();
	}
	
    public void aumentarSalario() {
        salario = salario + (salario * 0.13);
    }

	@Override
	public String toString() {
		return "Nombre: " + nombre + 
				"\nEdad: " + edad + 
				"\nCedula: " + cedula + 
				String.format("\nSalario: $%.2f", salario); // Para que muestre el numero completo y dos decimales
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	
}
