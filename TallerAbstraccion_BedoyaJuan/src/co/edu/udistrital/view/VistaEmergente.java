package co.edu.udistrital.view;

import javax.swing.JOptionPane;

public class VistaEmergente {
	
	public VistaEmergente() {
		
	}
	
	public String leerDato(String mensaje) {
		String dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje);
	}
	
}
