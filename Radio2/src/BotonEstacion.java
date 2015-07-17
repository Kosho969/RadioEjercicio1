/*		Ejercicio 1
		Pablo Barreno Koch 14159
		Santiago Solorzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonEstacion 
{
	String estacionActual;
	//constructor de la clase de estacion
	public BotonEstacion()
	{
		estacionActual = "FM";

	}
	//Obtiene la estacion del radio y cambia a fm si estaba en am y a am si estaba en fm
	public String  btnClick(String estacion)
	{
		if(estacion.equals("AM"))
		{
			estacionActual = "FM";
		}
		else if(estacion.equals("FM"))
		{
			estacionActual = "AM";
		}
		return estacionActual;
	}

}

