package ejecuta;

import clases.Coche;
import clases.ECombustibles;
import clases.Tren;
import clases.Vehiculo;

public class Inicio {

	public static void main(String[] args) {
		
		Vehiculo vehiculos []=new Vehiculo [3];
		Vehiculo veh;
		
		Coche miCoche= new Coche (true, ECombustibles.gasolina, "Coche", 1300, "Verde");
		Tren miTren = new Tren ("Tren",200000,"Blanco",10,true);
		
		//System.out.println(miCoche.toString());
		//System.out.println(miTren.toString());
		
		//I. Hacemos uso del polimorifsmo para almacenar en el array objetos de distinto tipo
		//===========================================================================================
		
		/*
		vehiculos[0]=miCoche; //No es necesario realizar la conversón explicita (Vehiculo)miCoche, gracias al boxing.
		vehiculos[1]=miTren;
		
		for(int i=0;i<2;i++)
		{
			veh=vehiculos[i];
			if(veh instanceof Tren) //Comprobamos si veh pertenece a la clase hija TREN
			{
				miTren = (Tren) veh; //Realizamos el unboxing
				System.out.println(miTren.toString());
			}
			else if (veh instanceof Coche)
			{
				miCoche = (Coche) veh;
				System.out.println(miCoche.toString());
			}
		}
		*/
		//II. Instanciar un objeto de un tipo como otro
		//================================================
		
		Vehiculo v= new Tren ();
		
		//III. Paso de parámetros
		//===========================
		v.mostrar(miTren);
		v.mostrar(miCoche);
		
		//Damos objetos de tipo Coche y Tren como paramtero y el metodo los lee como objetos Vehiculos, que es lo que utiliza.
		//Podemos utilizar el mostrar sin realizar sobrecarga de metodos en las clases Tren y Coche
		
	}

}
