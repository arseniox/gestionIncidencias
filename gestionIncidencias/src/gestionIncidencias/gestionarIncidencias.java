package gestionIncidencias;

import java.util.ArrayList;
import java.util.Scanner;

public class gestionarIncidencias {
	
	public static void limpiarPantalla() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Incidencia> arrayListIncidencias = new ArrayList<Incidencia>();
		int opcion = 0;
		int id;
		int puesto;
		String descripcion;
		String solucion;
        
        while (opcion != 4) {
        	limpiarPantalla();
        	
    		System.out.println();
            System.out.println("========================");
            System.out.println(" GESTIÓN DE INCIDENCIAS" );
            System.out.println("========================");
            System.out.println("1. Registrar nueva incidencia.");
            System.out.println("2. Resolver incidencia.");
            System.out.println("3. Mostrar incidencias.");
            System.out.println("4. Salir");
    		System.out.println();

            System.out.print("Introduzca qué operación desea realizar: ");
            opcion = input.nextInt();
            
            System.out.println("");

                        
            switch (opcion) {
                case 1:
                	limpiarPantalla();

                    System.out.println("=========================");
                    System.out.println(" REGISTRO DE INCIDENCIAS" );
                    System.out.println("=========================");
                    
                    System.out.print("Puesto: ");
                    puesto = input.nextInt();
                    input.nextLine();
                                        
                    System.out.print("Descripcion: ");
                    descripcion = input.nextLine();                    
                    
            		// Instanciamos una nueva incidencia y la añadimos a la lista de incidencias.
            		Incidencia nuevaInc = new Incidencia(puesto, descripcion);
            		arrayListIncidencias.add(nuevaInc);
            		
                    System.out.println("");
            		break;
            		
                case 2:
                	limpiarPantalla();

                    System.out.println("========================");
                    System.out.println("  RESOLVER INCIDENCIA"   );
                    System.out.println("========================");
                    
                    System.out.print("ID: ");
                    id = input.nextInt();
                    input.nextLine();
                                        
                    System.out.print("Solución: ");
                    solucion = input.nextLine();    
                    
            		// Iteramos a través del arraylist de incidencias en busca de la incidencia con el id de la incidencia que queremos resolver. 
            		// Una vez la encontramos actualizamos su estado a "Resuelto" y hacemos lo mismo añadiendo la solución que pediremos en el programa principal.
            		for (Incidencia incidencia : arrayListIncidencias) {
            			if (incidencia.getId() == id) {
            				incidencia.resolverIncidencia(incidencia, solucion);
            				break;
            			}
            		}

                    System.out.println("");
            		break;
                case 3:
                	
                    System.out.println("========================");
                    System.out.println("   MOSTRAR INCIDENCIAS"  );
                    System.out.println("========================");
                    
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
            		
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Ha salido del menú");
                    break;
                default:
                    System.out.println("Opción inválida. Seleccione otra opción.");
                    break;
            }
        }		
	}
}
