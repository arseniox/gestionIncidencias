# Gestión de Incidencias en Java

Este repositorio contiene un programa desarrollado en Java para la gestión de incidencias. El programa permite registrar nuevas incidencias, resolver incidencias existentes y mostrar todas las incidencias registradas.

## CLASES
Esta formado por una clase principal, *gestionarIncidencias*, donde se encuentra el método main y la ejecución del programa. También está formado por otra clase, *Incidencia*, que permite crear objetos de tipo *Incidencia* para luego poder gestionarlos en la clase principal.


### CLASE: *Incidencia*

### CLASE PRINCIPAL: *gestionarIncidencias*
La clase principal está formada por el método main() donde encontramos definidas diferentes instancias y variables:

    public  static  void  main(String[]  args)  {
			Scanner input = new Scanner(System.in);
			ArrayList<Incidencia> arrayListIncidencias = new ArrayList<Incidencia>();
			int opcion = 0;
			int id = 0;
			int puesto;
			int pendienteCount = 0;
			String descripcion;
			String solucion;
			...
	}
También encontramos un menú con diferentes opciones que nos permitirán gestionar las incidencias. Estas opciones son:
	
1. Registrar nueva incidencia.
2. Resolver incidencia.
3. Mostrar incidencias.
4. Salir

Al registrar una nueva incidencia se pide al usuario que introduzca el puesto y la descripción de la incidencia. La ID se aplica automáticamente incrementándose en uno cada nueva incidencia registrada. Por defecto, el estado de la incidencia tiene el valor de "Pendiente".

Si deseamos resolver una incidencia se preguntará la ID de la incidencia que se desea resolver y cuál ha sido la solución a la incidencia. Además el estado de la incidencia cambiará a "Resuelto". 

Si deseamos mostrar las incidencias existentes, se mostrará por pantalla una incidencia por cada línea con el siguiente formato:
Si la incidencia está Pendiente, se mostrarán todos los atributos menos el que indica la solución, en cambio si la incidencia está Resulta, sí que se mostraran todos los atributos.
