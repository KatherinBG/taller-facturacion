package com.estrategit.taller;

public class Cliente extends Persona{

	public Cliente(String nombrePersona, String cedula) {
		super(nombrePersona, cedula);
		
	}
	

	public String obtenerCedulaCliente() {
		return "Cliente:" + super.obtenerCedula();
	}
	
	

}
