package co.edu.udistrital.model;

public class Consultor extends Empleado {
	private int yearsExp;
	private int developTeams;
	
	public Consultor(String nombre, int edad, String cedula, double salario, 
			int yearsExp, int developTeams){
		
		super(nombre,edad, cedula, salario);
		this.yearsExp = yearsExp;
		this.developTeams = developTeams;
	}
	
    public void aumentarSalario() {
        salario = salario + (salario * 0.25);
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
