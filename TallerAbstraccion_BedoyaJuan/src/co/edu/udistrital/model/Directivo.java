package co.edu.udistrital.model;

public class Directivo extends Empleado {
	private int yearsExp;
	private String areaEnc;
	
	public Directivo(String nombre, int edad, String cedula,
			int yearsExp, String areaEnc){
		
		super(nombre,edad, cedula);
		this.yearsExp = yearsExp;
		this.areaEnc = areaEnc;
		this.salario = 5000000;
		bonificacion();
	}
	
	@Override
	public void bonificacion() {
		if(yearsExp > 8 && yearsExp <= 12)
			salario += salario * 0.3;
		if(yearsExp > 12)
			salario += salario * 0.50;	
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nAnnos de Experiencia: " + yearsExp +
				"\nArea encargada: " + areaEnc;
	}

	public int getYearsExp() {
		return yearsExp;
	}

	public void setYearsExp(int yearsExp) {
		this.yearsExp = yearsExp;
	}

	public String getAreaEnc() {
		return areaEnc;
	}

	public void setAreaEnc(String areaEnc) {
		this.areaEnc = areaEnc;
	}
	
	
}
