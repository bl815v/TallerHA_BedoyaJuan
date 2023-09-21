package co.edu.udistrital.model;

public class Directivo extends Empleado {
	private int yearsExp;
	private String areaEnc;
	
	public Directivo(String nombre, int edad, String cedula, double salario, 
			int yearsExp, String areaEnc){
		
		super(nombre,edad, cedula, salario);
		this.yearsExp = yearsExp;
		this.areaEnc = areaEnc;
	}
	
    public void aumentarSalario() {
        salario += salario * 0.35;
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
