package gestionIncidencias;

import java.util.ArrayList;

public class Incidencia {
	
	// ATRIBUTOS
	private static int contador = 1;
	private int id;
	private int puesto;
	private String descripcion;
	private String estado;
	private String solucion;
	
	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPuesto() {
		return puesto;
	}
	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSolucion() {
		return solucion;
	}
	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	
	// CONSTRUCTORES
	
	public Incidencia() {
		this.id=0;
		this.puesto=0;
		this.descripcion = "";
		this.estado = "";
		this.solucion = "";
	}
	
	public Incidencia(int puesto, String descripcion) {
		this.id=contador;
		this.puesto=puesto;
		this.descripcion = descripcion;
		this.estado = "Pendiente";
		this.solucion = "";
		
		contador = contador + 1;
	}
}
