/*		Ejercicio 1
		Pablo Barreno Koch 14159
		Santiago Solorzano  14619
		
		Clase Menu: Main. El controlador del radio
*/
import java.util.Scanner;
public class Menu 
{
	//El scanner del teclado
	private static Scanner teclado;

	public static void main(String[] args)
	{
		teclado = new Scanner(System.in); // genero el teclado
		Radio MiRadio = new Radio();	//se genera el nuevo radio
		int botonGuardarElegido;		// variable para almacenar el boton a elegir donde guardar o cargaar una emisora
		String opcionMenu = "";			//variable para el ingreso de opciones en el menu
		
		//ciclo que repite el menu hasta salirse ingresando 7 
		while(!opcionMenu.equals("8"))
		{
			//impresion del menu
			System.out.println("\n\n RADIO \n\n 1. Enciende el radio \n 2. Cambia de AM a FM a AM \n 3. Avanzar en el dial de las emisoras.\n 4. Regresar en el dial de las emisoras \n 5. Permite guardar una emisora en uno de los 12 botones \n 6. Permite seleccionar la emisora puesta en un boton \n 7. Apagar el radio \n 8. Salir del programa ");
			//ingreso de la opcion
			opcionMenu = teclado.nextLine();
			//Opcion que enciende al radio llamando a la funcion encender
			if(opcionMenu.equals("1"))
			{
				MiRadio.Encender();
				System.out.println("\nEstoy encendido en " + MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion() );
			}
			//funcion que obtiene el valor actual de la estacion y cambia dependiendo en que se encontraba am/fm
			if(opcionMenu.equals("2"))
			{
				if(MiRadio.obtenerEstado() != false)
				{
										
					System.out.println("\nEl radio estaba en "+ MiRadio.obtenerEstacion());
					MiRadio.establecerEstacion(MiRadio.btnEstacion.btnClick(MiRadio.obtenerEstacion()));
					System.out.println("\nEl radio esta ahora en "+ MiRadio.obtenerEstacion());
				}
				else
				{
					System.out.println("\n Error. El radio esta apagado.");
				}
			}
			//funcion que obtiene el valor de la frecuencia y la estacion actales y dependiendo la estacion adelanta la frecuencia
			if (opcionMenu.equals("3"))
			{
				if(MiRadio.obtenerEstado() != false)
				{
									
					System.out.println("\nEl radio estaba en "+ MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion());
				
					 MiRadio.establecerFrecuencia(MiRadio.btnForward.Adelantar(MiRadio.obtenerEstacion(), MiRadio.obtenerFrecuencia()));
	
					System.out.println("\nEl radio esta ahora en "+ MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion());
				}
				else
				{
					System.out.println("\n Error. El radio esta apagado.");
				}
			
			}
			if (opcionMenu.equals("4"))
			{
				if(MiRadio.obtenerEstado() != false)
				{
									
					System.out.println("\nEl radio estaba en "+ MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion());
				
					 MiRadio.establecerFrecuencia(MiRadio.btnBackward.Regresar(MiRadio.obtenerEstacion(), MiRadio.obtenerFrecuencia()));
	
					System.out.println("\nEl radio esta ahora en "+ MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion());
				}
				else
				{
					System.out.println("\n Error. El radio esta apagado.");
				}
			
			}
			//funcion que guarda en un botno de guradar la estacion y frecuencia acutal 
			if(opcionMenu.equals("5"))
			{
				if(MiRadio.obtenerEstado() != false)
				{
					System.out.println("\nIngrese el numero de boton en el que desea guardar la emisora actual <1-12> \n");
					botonGuardarElegido = (teclado.nextInt()) - 1;
					teclado.nextLine();
					MiRadio.listaGuardados[botonGuardarElegido].Guardar(MiRadio.obtenerEstacion(), MiRadio.obtenerFrecuencia());
					System.out.println("\nListo se guardo en el slot " + (botonGuardarElegido + 1) + " la emisora " + MiRadio.obtenerEstacion() + " " + MiRadio.obtenerFrecuencia());
			
				}
				else
				{
					System.out.println("\n Error. El radio esta apagado.");
				}
			}
			//funcion que carga una emisora y una frecuencia al radio de un boton guardado anteriormente
			if(opcionMenu.equals("6"))
			{
				if(MiRadio.obtenerEstado() != false)
				{
					System.out.println("\nIngrese el numero de boton en el que desea cargar la emisora <1-12> \n");
					botonGuardarElegido = (teclado.nextInt())-1;
					teclado.nextLine();
					MiRadio.establecerFrecuencia(MiRadio.listaGuardados[botonGuardarElegido].CargarFrecuencia());
					MiRadio.establecerEstacion(MiRadio.listaGuardados[botonGuardarElegido].CargarEstacion());
					System.out.println("\nEl radio esta ahora en "+ MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion());
				
				}
				else
				{
					System.out.println("\n Error. El radio esta apagado.");
				}
			}
			// se apaga el radio
			if(opcionMenu.equals("7"))
			{
				MiRadio.Apagar();
				System.out.println("\nEstoy Apagado");
			}
			//si ninguna opcion inrgesada existe lanza un error de ingreso
			else if(!opcionMenu.equals("1")&&!opcionMenu.equals("2")&&!opcionMenu.equals("3")&&!opcionMenu.equals("4")&&!opcionMenu.equals("5")&&!opcionMenu.equals("6")&&!opcionMenu.equals("7")&&!opcionMenu.equals("8")) 
			{
				System.out.println("\nError de ingreso. Intente de nuevo.");
			}
			
		}
		//despedida
		System.out.println("\n\nAdios");
	}
}
