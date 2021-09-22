package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		 * Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		 * 
		 * Alberto Calleja Pascual
		 */
		
		int resto;
		//Scanner sc= new Scanner(System.in);
		boolean primo;
		
		//System.out.println("Introduzca numero");
		//numero=sc.nextInt();
		
		for(int numero=1;numero<=100;numero++)
		{
			primo=true;
		if(numero<2)
		{
			primo=false;
		}
		for(int candidatoDivisor=2; candidatoDivisor<numero && primo==true; candidatoDivisor++)
		{
			resto = numero%candidatoDivisor;
			if(resto==0)
			{
				primo=false;
			}
		}
		if(primo==true)
		{
			System.out.println(numero);
		}	
		//sc.close();
		}
		
	}

}
