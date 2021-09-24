package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Movil;

public class Inicio {
	public static void main(String[] args) {
		//Declaramos las variables
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		int imai;
		Scanner sc= new Scanner(System.in);
		Movil movilJuan= new Movil (8,"Huawei",4,1456);
		Movil movilAna= new Movil (8,"Apple",4,2223);
		Movil movilElias= new Movil (16,"Samsung",4,3334);
		Movil movilSara= new Movil (8,"Huawei",8,1567);
		//fin declaracion
		
		
		//Poblamos el arraylist
		moviles.add(movilElias);
		moviles.add(movilSara);
		moviles.add(movilAna);
		moviles.add(movilJuan);
		
		//Mostramos el contenido
		System.out.println("Contenido ArrayList:");
		for(Movil movil : moviles)
		{
			System.out.println(movil);
		}
		
		//Realizamos una busqueda por imai
		System.out.println("Introduzca imai a buscar: ");
		imai=sc.nextInt();
		Movil movilBusqueda= new Movil ();
		movilBusqueda.setImei(imai);
		
		
		if(moviles.contains(movilBusqueda)==true)
		{
			System.out.println("Encontrado");
		}
		else
		{
			System.out.println("No encontrado");
		}
	}

}
