package com.estrategit.taller;

public class Persona {

	protected String nombrePersona;
	protected String cedula;
	
	
	public Persona(String nombrePersona, String cedula) {
		super();
		this.nombrePersona = nombrePersona;
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombrePersona;
	}
	public void setNombre(String nombre) {
		this.nombrePersona = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
		
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombrePersona=" + nombrePersona + ", cedula=" + cedula + "]";
	}
	public String obtenerCedula() {
		return cedula;
	}
	
	public void run() {
		for(int i=0 ; i<5; i++) {
			System.out.println("Cliente:"+nombrePersona);
	
	
}
	}
}
