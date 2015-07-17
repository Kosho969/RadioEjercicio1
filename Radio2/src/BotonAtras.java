/*	Ejercicio 1
		Pablo Barreno Koch 14159
		Santiago Solorzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonAtras {
	String estacion;
	double frecuencia;
	//constructor del boton con parametros por default
	public BotonAtras()
	{
		estacion = "";
		frecuencia = 0.0;
	}
	//obtiene la estacion y la frecuencia. compara si la frecuencia es am o fm y dependiendo la estacion le suma 10 o .2 a la frecuencia
	//si excede la frecuencia regresa a la menor y devuelve la frecuencia nueva
	public double  Regresar(String estacion, double Frecuencia )
	{
		if(estacion=="FM")
		{
			frecuencia = Frecuencia;
			frecuencia -= 0.2;
			if(frecuencia < 87.9)
				frecuencia = 107.9;
		}
		if(estacion=="AM")
		{
			frecuencia = Frecuencia;
			frecuencia -= 10;
			if(frecuencia < 530)
				frecuencia = 1610;
		}
		return frecuencia;
	}

}
