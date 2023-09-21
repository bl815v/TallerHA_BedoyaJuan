package co.edu.udistrital.model;

public class Consultor extends Empleado {
	private int yearsExp;
	private int developTeams;
	
	public Consultor(String nombre, int edad, String cedula,
			int yearsExp, int developTeams){
		
		super(nombre,edad, cedula);
		this.yearsExp = yearsExp;
		this.developTeams = developTeams;
		this.salario = 3000000;
		bonificacion();
	}
	
	@Override
	public void bonificacion() {
		if(developTeams > 5 && developTeams <= 8)
			salario += salario * 0.25;
		if(developTeams > 8)
			salario += salario * 0.50;	
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nAnnos de Experiencia: " + yearsExp +
				"\nEquipos de Desarrollo Liderados: " + developTeams;
	}

	public int getYearsExp() {
		return yearsExp;
	}

	public void setYearsExp(int yearsExp) {
		this.yearsExp = yearsExp;
	}

	public int getDevelopTeams() {
		return developTeams;
	}

	public void setDevelopTeams(int developTeams) {
		this.developTeams = developTeams;
	}

	
}
