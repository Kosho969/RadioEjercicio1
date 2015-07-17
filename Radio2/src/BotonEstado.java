/*		Ejercicio 1
		Pablo Barreno Koch 14159
		Santiago Solorzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonEstado 
{
	boolean estado;
	//constructor del estado
	public BotonEstado()
	{
		estado = false;
	}
	//funcion quecambia el estadio del radio a encendido
	public boolean Encender()
	{
		estado = true;
		return estado;
	}
	//funcion que cambia el estado del radio a false
	public boolean Apagar()
	{
		estado = false;
		return estado;
	}
	// envia el estado en el que se encutraea el radio actualemnte
	public boolean obtenerEstado()
	{
		return estado;
	}

}
