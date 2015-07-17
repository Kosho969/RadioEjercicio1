/*		Ejercicio 1
		Pablo Barreno Koch 14159
		Santiago Solorzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonAdelante 
{
	String estacion;
	double frecuencia;
	
	//constructor del boton
	public BotonAdelante()
	{
		estacion = "";
		frecuencia = 0;
	}
	//adelanta la frecuencia dependiendo de la estacion
	public double Adelantar(String estacion,double Frecuencia)
	{
		if(estacion.equals("FM"))
		{
			frecuencia = Frecuencia ;
			frecuencia += 0.2;
			if(frecuencia > 107.9)
			{
				frecuencia = 87.9;
			}
				
		}
		else if(estacion.equals("AM"))
		{
			frecuencia = Frecuencia;
			frecuencia += 10;
			if(frecuencia > 1610)
				frecuencia = 530;
		}
		return frecuencia;
	}
}
