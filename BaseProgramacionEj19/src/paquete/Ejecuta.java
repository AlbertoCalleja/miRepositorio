package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*Realiza un programa que lea desde teclado 4 números y posteriormente muestre
		 *solamente los que sean pares.
		 * 
		 * Alberto Calleja Pascual
		 * 22-09-2021
		 */
		String contenidoArrays;
		int numeros [];
		numeros= new int [4];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("Introduzca un numero");
			numeros[i]=sc.nextInt();
		}
		System.out.println("Los pares son: ");
		for(int i=0;i<=3;i++)
		{
			if(numeros[i]%2==0)
			{
				System.out.println(numeros[i]);
			}
		}
		//Mostrar la dirección de memoria del array
		System.out.println(numeros);
		
		//Si queremos ver los datos realmente
		contenidoArrays = Arrays.toString(numeros);
		System.out.println(contenidoArrays);
		
		//Recorremos el array
		for(int j=0;j<numeros.length;j++)
		{
			System.out.println(numeros[j]);
		}
	}

}
