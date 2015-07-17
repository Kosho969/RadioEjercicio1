/*		Ejercicio 1
		Pablo Barreno Koch 14
		Santiago Solórzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonGuardados 
{
	String estacion;
	double frecuencia;
	//guardar la frcuencia y la estacion en un boton
	public BotonGuardados()
	{
		estacion="";
		frecuencia=87.9;
		
	}
	//carga los valores que tiene el radio actualmente y los almacena en el boton
	public void Guardar(String Estacion, double Frecuencia)
	{
		estacion=Estacion;
		frecuencia=Frecuencia;
	}
	//envia la estacion del boton
	public String CargarEstacion()
	{
		return estacion;

	}
	//envia la frecuencia del boton
	public double CargarFrecuencia()
	{
		return frecuencia;
	}
}
