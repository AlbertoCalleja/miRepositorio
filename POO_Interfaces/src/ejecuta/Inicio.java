package ejecuta;

import java.util.Scanner;

import clases.GestionListado;

public class Inicio {

	public static void main(String[] args) {
		/*
		31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		4.- Eliminar todos los números.
		5.- Salir.	
		*/
		GestionListado gestion;
		Scanner sc= new Scanner(System.in);
		int opcion;
		int num;
		String  menu;
		
		gestion=new GestionListado();
		menu= "			--Menú:--\n"
				+ "	1.- Introducir número entero.\n"
				+ "	2.- Listar números.\n"
				+ "	3.- Eliminar número.\n"
				+ "	4.- Eliminar todos los números.\n"
				+ "	5.- Salir.";

		do
		{
			System.out.println(menu);
			System.out.println("Introduzca opción: ");
			
			try
			{
				opcion=Integer.valueOf(sc.nextLine());
				
				switch(opcion)
				{
				case 1:
					System.out.println("Introduzca numero: ");
					num=Integer.valueOf(sc.nextLine());
					gestion.nuevo(num);
				break;
				
				case 2:
					gestion.listar();
				break;
				
				case 3:
					System.out.println("Introduzca el numero a eliminar: ");
					num=Integer.valueOf(sc.nextLine());
					
					gestion.eliminar(num);
				break;
				
				case 4:
					gestion.eliminar();
				break;
				
				case 5:
					System.out.println("¡Hasta pronto!");
				break;
				
				default :
					System.out.println("Opcion incorrecta.");
				break;
				}
					
			}
			catch(NumberFormatException e)
			{
				System.out.println("Introduzca una opción de tipo entero.");
				opcion=0;//Para que opcion vuelva a ser asignada
			}
		}while(opcion!=5);
		
			
			
			

	}

}
