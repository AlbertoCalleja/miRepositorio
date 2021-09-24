package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		Movil movilJuan = new Movil (8,"Xiaomi",4,1);
		Movil movilMaria = new Movil (8,"Xiaomi",4,2);
		
		//Realmente estariamos comparando direcciones de memoria de los objetos, por eso falla, tendremos que crear un método equals
		/*if(movilMaria.equals(movilJuan)) 
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("Son diferentes");
		}
		*/
		
		//Ahora tenemos un campo que identifica los moviles, el imei
		if(movilJuan.getImei()==movilMaria.getImei())
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("Son diferentes");
		}
		
	}

}
