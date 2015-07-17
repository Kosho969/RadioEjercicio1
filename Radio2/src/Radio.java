/*		Ejercicio 1
		Pablo Barreno Koch 14159
		Santiago Solorzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class Radio 
{
	String estacionActual;
	double frecuenciaActual;
	boolean estadoActual;
	BotonEstado btnEstado;
	BotonGuardados btnGuardados1, btnGuardados2, btnGuardados3, btnGuardados4, btnGuardados5, btnGuardados6, btnGuardados7, btnGuardados8, btnGuardados9, btnGuardados10, btnGuardados11, btnGuardados12;
	BotonGuardados[] listaGuardados = new BotonGuardados[12];
	BotonEstacion btnEstacion;
	BotonAdelante btnForward;
	BotonAtras btnBackward;
	
	//El contructor de la clase
	public Radio()
	{
		estacionActual = "FM";
		frecuenciaActual = 87.9;
		estadoActual = false;
		btnEstado = new BotonEstado();
		btnEstacion = new BotonEstacion();
		btnForward = new BotonAdelante();
		btnBackward = new BotonAtras();
		//los botones para almacenar estaciones y frecuencias
		btnGuardados1 = new BotonGuardados();
		btnGuardados2 = new BotonGuardados();
		btnGuardados3 = new BotonGuardados();
		btnGuardados4 = new BotonGuardados();
		btnGuardados5 = new BotonGuardados();
		btnGuardados6 = new BotonGuardados();
		btnGuardados7 = new BotonGuardados();
		btnGuardados8 = new BotonGuardados();
		btnGuardados9 = new BotonGuardados();
		btnGuardados10 = new BotonGuardados();
		btnGuardados11 = new BotonGuardados();
		btnGuardados12 = new BotonGuardados();
		//se almacenan los botones en una arreglo de botones
		listaGuardados[0] = btnGuardados1;
		listaGuardados[1] = btnGuardados2;
		listaGuardados[2] = btnGuardados3;
		listaGuardados[3] = btnGuardados4;
		listaGuardados[4] = btnGuardados5;
		listaGuardados[5] = btnGuardados6;
		listaGuardados[6] = btnGuardados7;
		listaGuardados[7] = btnGuardados8;
		listaGuardados[8] = btnGuardados9;
		listaGuardados[9] = btnGuardados10;
		listaGuardados[10] = btnGuardados11;
		listaGuardados[11] = btnGuardados12;
		
	}
	//Metodo que enciende el radio
	public void Encender()
	{
		 estadoActual = btnEstado.Encender() ;
	}
	//Metodo que apaga el radio
	public void Apagar()
	{
		 estadoActual = btnEstado.Apagar();
	}
	
	//Metodo para adeltar de frecuencia al presionar el boton
	public void Adelantar()
	{
		if(estadoActual!=false)
			frecuenciaActual = btnForward.Adelantar(estacionActual, frecuenciaActual);
		else
			System.out.println("Error radio apagado");
	}
	
	//Metodo para regresar de frecuencia al presionar el boton
	public void Regresar()
	{
		if(estadoActual!=false)
			frecuenciaActual=btnBackward.Regresar(estacionActual, frecuenciaActual);
		else
			System.out.println("Error radio apagado");
	}
	//Metodo que obtiene la estacion actual
	public String obtenerEstacion()
	{
		return estacionActual;
	}
	//Metodo que obtiene la frecuencia actual
	public double obtenerFrecuencia()
	{
		return frecuenciaActual;
	}
	
	//Metodo que obtiene el esatdo del radio
	public boolean obtenerEstado()
	{
		estadoActual = btnEstado.obtenerEstado();
		return estadoActual;
	}
	
	//Metodo que actualiza la frecuencia del radio
	public void establecerFrecuencia(double frecuencia)
	{
		if(estadoActual!=false)
			frecuenciaActual = frecuencia;
		else
			System.out.println("Error radio apagado");
	}
	//Metodo que actualiza la estacion del radio
	public void establecerEstacion(String Estacion)
	{
		if(estadoActual!=false)
			estacionActual = Estacion;
		else
			System.out.println("Error radio apagado");
	}
	
	
	
	
	
}
