package ejecuta;

import java.util.HashMap;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) 
	{
		//Valores movilJuan  | movilAna   | movilMarcos   | objeto Movil
		//-------------------------------------------------
		//Clave (imei)    1221|    3222   |           6781| tipo Integers
		
		//HashMap<Integer, Movil> moviles;
		var moviles = new HashMap<Integer, Movil>();
		Movil movilJuan = new Movil (16,"Samsung",5,1221);
		Movil movilAna = new Movil (32,"Xiaomi",6,3222);
		Movil movilMarcos = new Movil (64, "Apple", 7, 6781);
		
		Movil movilBusqueda = new Movil (16,"Samsung",5,1221); //Estamos creando una nueva instancia, por lo que tendrá otra dirección
		//de memoria.
		
		moviles.put(movilJuan.getImei(), movilJuan);
		moviles.put(movilAna.getImei(),movilAna);
		moviles.put(movilMarcos.getImei(),movilMarcos);
		
		if(moviles.containsValue(movilBusqueda)) //Estariamos buscando mediante el metodo equals (se usa en containsValue)
			//Luego debemos redefinir el metodo equals en Movil.
		{
			System.out.println("Encontrado");
		}
		else
		{
			System.out.println("No encontrado");
		}
	}

}
