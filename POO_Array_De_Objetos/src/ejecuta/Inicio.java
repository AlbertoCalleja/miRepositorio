package ejecuta;

import clases.Movil;

public class Inicio {
	public static void main(String[] args) {
		
		/*Movil moviles []= {new Movil(8,"Apple",4),
		new Movil(16,"Samsung",5),
		new Movil(32,"Oppo",6)};  
		*/
		
	//Declaramos el array	
	Movil moviles []= new Movil [3];
	
	//Declaramos tres objetos, es decir, tres instancias de la clase Movil
	Movil m1=new Movil (8,"Apple",4);
	Movil m2=new Movil (16,"Samsung",5);
	Movil m3=new Movil (32,"Oppo",6);
	
	//Declaramos un objeto de tipo Movil
	Movil movil;
	
	//Declaramos una variables texto
	String texto;
	
	//Poblamos el array con los objetos
	moviles[0]=m1;
	moviles[1]=m2;
	moviles[2]=m3;
	
	for(int i=0;i<moviles.length;i++)
	{
		System.out.println(moviles[i].toString());
		
		/*
		 * o
		 * 
		 * movil=moviles[i];
		 * 
		 * texto=moviles[i].toString();
		 * System.out.println(texto);
		 */
	}
	
	
	
	
	
	}
}
