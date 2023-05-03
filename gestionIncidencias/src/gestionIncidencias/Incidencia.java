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
	
	// MÉTODOS
	
	public static Incidencia registrarIncidencia(int puesto, String descripcion, ArrayList<Incidencia> arrayListIncidencias) {
		
		// Instanciamos una nueva incidencia y la añadimos a la lista de incidencias.
		Incidencia nuevaInc = new Incidencia(puesto, descripcion);
		arrayListIncidencias.add(nuevaInc);
		
		return nuevaInc;
	}
	
	public static void resolverIncidencia(int id, String solucion, ArrayList<Incidencia> arrayListIncidencias) {
		
		// Iteramos a través del arraylist de incidencias en busca de la incidencia con el id de la incidencia que queremos resolver. 
		// Una vez la encontramos actualizamos su estado a "Resuelto" y hacemos lo mismo añadiendo la solución que pediremos en el programa principal.
		for (Incidencia incidencia : arrayListIncidencias) {
			if (incidencia.getId() == id) {
				incidencia.setEstado("Resuelto");
				incidencia.setSolucion(solucion);
				break;
			}
		}		
	}
	
	public static void mostrarIncidencias(ArrayList<Incidencia> arrayListIncidencias) {
		
		// Iteramos a través del arraylist de incidencias y vamos mostrando los atributos de cada incidencia, antes comprobando si su estado es "Pendiente", 
		// en cuyo caso no imprimiremos su atributo "solucion", ya que está vacío; en caso contrario, sí imprimiremos todos sus atributos.
		for (Incidencia incidencia : arrayListIncidencias) {
			if (incidencia.getEstado() == "Pendiente") {
				System.out.println("Incidencia: " + incidencia.getId() +
								   " - Puesto: " +  incidencia.getPuesto() +
								   " - " + incidencia.getDescripcion() + 
								   " - Estado: " +  incidencia.getEstado()
								   );
			}
			else {
				System.out.println("Incidencia: " + incidencia.getId() +
								   " - Puesto: " +  incidencia.getPuesto() +
								   " - " + incidencia.getDescripcion() + 
								   " - Estado: " +  incidencia.getEstado() +
								   " - " + incidencia.getSolucion()
								   );
			}
		}		
	}
}
