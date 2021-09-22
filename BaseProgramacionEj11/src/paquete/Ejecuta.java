package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		 * Programa que lee nombre y aÃ±o de nacimiento de una serie de alumnos hasta introducir
	 nombre de alumno â€œfinâ€�. En ese momento mostrarÃ¡ la edad media de los alumnos y
	el nombre del alumno menor. NOTA: Al introducir como nombre â€œfinâ€�, no nos ha de pedir el
	aÃ±o de nacimiento.
		 * 
		 * 
		 */
		int agnoNacimiento;
		int agnoActual=Calendar.getInstance().get(Calendar.YEAR);
		String nombre;
		String nombreMenor=null;
		String mensaje;
		int suma=0; //acumulador
		int edad;
		int contEdad=0; //contador
		int menor=Integer.MAX_VALUE;
		float media;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca nombre:");
		nombre=sc.nextLine();
		
		while(nombre.equals("fin")==false)
		{

				System.out.println("Introduzca aÃ±o de nacimiento:");
				agnoNacimiento=Integer.valueOf(sc.nextLine());
				
				edad=agnoActual-agnoNacimiento;
				contEdad ++;
				
				suma=suma+edad;
				if(edad<menor)
				{
					menor=edad;
					nombreMenor=nombre;
				}
				System.out.println("Introduzca nombre:");
				nombre=sc.nextLine(); 
				
		}
		
		if(contEdad>0)
		{
			media=(float)suma/contEdad;
			mensaje= "La media de edad es: "+media+" y el alumno mÃ¡s joven es: "+nombreMenor;
			System.out.println(mensaje);
		}
		sc.close();
		//Fin
	}

}
