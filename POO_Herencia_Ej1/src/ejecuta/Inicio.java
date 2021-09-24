package ejecuta;

import clases.Hamster;
import clases.Mascota;

public class Inicio {

	public static void main(String[] args) {
		Mascota m= new Mascota ("Jota",5);
		String texto;
		Hamster miHamster = new Hamster("Hans",3,"Marron","Secura");
		Hamster miHamster2 = new Hamster ();
		String texto2;
 		
		texto=m.toString();
		System.out.println(texto);
		
		System.out.println(miHamster.toString());
		
			//Fin
	}

}
