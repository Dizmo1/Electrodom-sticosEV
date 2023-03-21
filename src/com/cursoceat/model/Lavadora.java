package com.cursoceat.model;

public class Lavadora extends Electrodomestico {
     protected double precio;
     protected boolean aguaCaliente;
     
	public Lavadora( String marca, double potencia,  boolean aguaCaliente) {
		super(null,marca, potencia);
		this.aguaCaliente=aguaCaliente;
		this.aguaCaliente = false;
	}

	public Lavadora( String marca,double precio, double potencia,boolean aguaCaliente) {
		super(null, marca, potencia);
		this.precio=precio;
		this.aguaCaliente=aguaCaliente;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	@Override
	public String toString() {
		return "Características Lavadora:marca= " +marca+ " precio=" + precio + ", aguaCaliente=" + aguaCaliente +" "
				+ ", potencia= "+potencia;
				 
	}
}



	
	

	
	
	
     
     

