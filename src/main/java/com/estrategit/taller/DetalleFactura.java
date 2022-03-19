package com.estrategit.taller;

public class DetalleFactura extends Factura{
	
	protected String descripcioncompra;
	protected Double totalPago;
	
	
	public String getDescripcioncompra() {
		return descripcioncompra;
	}
	public void setDescripcioncompra(String descripcioncompra) {
		this.descripcioncompra = descripcioncompra;
	}
	public Double getTotalPago() {
		return totalPago;
	}
	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}

	
	
}
