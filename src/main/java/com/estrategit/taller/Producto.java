package com.estrategit.taller;

public class Producto {
	
	protected String nombreProducto;
	protected String tipoProducto;
	
	public Producto(String nombreProducto, String tipoProducto) {
		super();
		this.nombreProducto = nombreProducto;
		this.tipoProducto = tipoProducto;
	}
	public String getNombreProducto() {
		
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	
	

}
