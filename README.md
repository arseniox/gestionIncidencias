
# Gestión de Incidencias en Java
Este repositorio contiene un programa desarrollado en Java para la gestión de incidencias. El programa permite registrar nuevas incidencias, resolver incidencias existentes y mostrar todas las incidencias registradas.

## CLASES
Esta formado por una clase principal, *gestionarIncidencias*, donde se encuentra el método main y la ejecución del programa. También está formado por otra clase, *Incidencia*, que permite crear objetos de tipo *Incidencia* para luego poder gestionarlos en la clase principal.


### CLASE: *Incidencia*
La clase *Incidencia* es la clase encargada de crear las incidencias definiéndolas con sus atributos correspondientes. Está formada por cinco atributos, *con getters y setters correspondientes*, y dos constructores (vacío y completo):

    // ATRIBUTOS
    	private static int contador = 1;
    	private int id;
    	private int puesto;
    	private String descripcion;
    	private String estado;
    	private String solucion;
    	...
El atributo estático *contador* no define directamente a un objeto de tipo *Incidencia* pero permitirá que dentro de los constructores su atributo *id* se autoincremente en uno.
   
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
		...
Disponemos de dos constructores, uno vacío y el otro "completo". Este último no contiene todos los atributos como parámetros ya que, en el caso de *id* se autoincrementa en uno cada vez que instanciamos un objeto gracias a la variable estática *contador*. Refiriéndonos a el atributo *estado*, al inicializar el objeto siempre tendrá el valor de "Pendiente" y por lo tanto el atributo *solucion* deberá estar "vacío" ya que todavía la incidencia no ha sido resuelta.


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
Si la incidencia está "Pendiente", se mostrarán todos los atributos menos el que indica la solución, en cambio si la incidencia está "Resuelto", sí que se mostraran todos los atributos. También se mostrará un recuento de todas las incidencias que estén pendientes por resolver.

## CONCLUSIÓN
Con este pequeño programa es posible gestionar introducir incidencias dentro de una "empresa", resolver dichas incidencias y visualizarlas.
