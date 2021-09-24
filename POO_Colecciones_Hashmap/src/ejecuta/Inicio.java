package ejecuta;

import java.util.HashMap;

public class Inicio {

	public static void main(String[] args) {
		// ----------------------------------------------
		//Value 20 |      10  |          15   |          40|
		//------------------------------------------------
		//Key Otono |Invierno | Primavera     | Verano
		
		//HashMap<String, Integer> temperaturasMaximasEstacion; //Tenemos un hashmap. El primer valor indica el tipo de las key (claves)
		//y el segundo el tipo de las valores.
		//temperaturasMaximasEstacion=new HashMap<String, Integer>();
		
		//Mas comodo con var
		var temperaturasMaxEstacion = new HashMap<String,Integer>();
		int temperaturaPrimavera;
		String mensaje;
		
		//Añadir elementos
		temperaturasMaxEstacion.put("otono", 20);
		temperaturasMaxEstacion.put("invierno", 10);
		temperaturasMaxEstacion.put("primavera",15);
		temperaturasMaxEstacion.put("verano", 40);
		
		temperaturaPrimavera= temperaturasMaxEstacion.get("primavera");
		mensaje="La maxima temperatura de la primavera fue "+temperaturaPrimavera+" grados.";
		System.out.println(mensaje);
		
		//Eliminar un elemento dada la clave
		//Antes comprobamos si la clave existe mediante el metodo containsKey
		if(temperaturasMaxEstacion.containsKey("primavera")==true)
		{
			temperaturasMaxEstacion.remove("primavera");
			System.out.println("Elemento eliminado");
		}
		else
		{
			System.out.println("No se ha podido encontrar");
		}
		
		//Comprobamos si un valor se encuentra en la coleccion
		if(temperaturasMaxEstacion.containsValue(10)==true)
		{
			System.out.println("El valor 10 está en la colección");
		}
		else
		{
			System.out.println("El valor 10 no está en la colección");
		}
				
		//Modificar elementos
		temperaturasMaxEstacion.put("verano",42);
		
		
		//En las colecciones se eliminan los huecos, en los arrays, no. Quedaría asi:
		//------------------------------------
		// |       20|       10 |        40|
		//-------------------------------------
		// |otono    | invierno | verano   |
		//------------------------------------------
		
		//Recorremos la coleccion por las claves
		//for(String clave: temperaturasMaxEstacion.keySet())
		//{
		//	mensaje="La maxima temperatura de "+ clave + " fue de "+ temperaturasMaxEstacion.get(clave)+ " grados.";
		//	System.out.println(mensaje);
		//}
		
		/*
		 * Ejemplo de bucle for each
		int notas [] = {10,9,8,6};
		for(int nota : notas)
		{
			System.out.println(nota);
		}
		*/
	}

}
