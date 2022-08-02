package com.welcome;

public class Calculo {

	private String nombre;
	private Double tiempoInicial; // usuario
	private Double tiempoFinal; // usuario
	private Double distancia; // usuario
	private Double velocidad; // lo calculo con el método VELOCIDAD()
	private Double tiempoTotal; // lo calculo con el método tiempoTotal()
	
	// CONSTRUCTOR AL QUE LE VOY A PASAR LOS DATOS QUE EL USUARIO ME MANDA POR EL FORMULARIO
	
	public Calculo(String nombre, String inicial, String tfinal, String distancia) {
		this.nombre = nombre;
		this.tiempoInicial = Double.parseDouble(inicial);
		this.tiempoFinal = Double.parseDouble(tfinal);
		this.distancia = Double.parseDouble(distancia);
	}
	
	public void velocidad() {
		this.velocidad = distancia / (tiempoFinal - tiempoInicial);
	}
	
	public Double getVelocidad() {
		return velocidad;
	}
	
	public void tiempoTotal() {
		this.tiempoTotal = tiempoFinal - tiempoInicial; 
	}
	
	public Double getTiempoTotal() {
		return tiempoTotal;
	}

	public String getNombre() {
		return nombre;
	}	
}


