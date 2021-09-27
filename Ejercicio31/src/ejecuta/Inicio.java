package ejecuta;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		//Ejercicio 31: Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		//de 18 elementos. No se permitirán repetidos:
		//
		//Alberto
		
		String menu;
		Scanner sc= new Scanner(System.in);
		int opcion;
		int i=0;
		int j;
		int num;
		int contIntercambios;
		int aux;
		
		int numeros []= new int [18];
		
		menu="--MENÚ--\n"+
				"1.-Introducir número \n"+
				"2.-Listar números \n"+
				"3.-Eliminar número \n"+
				"4.-Eliminar todos los números\n"+
				"5.-Salir \n";
		
		do
		{
			System.out.println(menu);
			System.out.print("Introduzca opcion ");
			opcion=sc.nextInt();
			
			switch(opcion)
			{
				case 1:
					//Comprobamos que la tabla no esté llena.
					if(i==18)
					{
						System.out.println("Tabla llena");
					}
					else
					{
						//Pedimos el numero
						System.out.println("Introduzca numero");
						num=sc.nextInt();
						
						//Comprobamos que no está repetido
						for(j=0;j<i && numeros[j]!=num;j++);
						
						//... Si no está repetido se añade
						if(i==j)
						{
							numeros[i]=num;
							i++;
							
							//Ordenamos el array con el algoritmo de la burbuja
							do
							{
								contIntercambios=0;
								
								for(j=0;j<i-1;j++)
								{
									if(numeros[j]>numeros[j+1])
									{
										aux=numeros[j];
										numeros[j]=numeros[j+1];
										numeros[j+1]=aux;
										
										//Incrementamos el contador de intercambios
										contIntercambios++;
									}
								}
							}while(contIntercambios>0);
						}
						//Si está repetido, no se añade e informamos al usuario
						else
						{
							System.out.println("Número repetido. No ha sido almacenado.");
						}
					}
					
					
				break;
				
				case 2:
					if(i==0)
					{
						System.out.println("Sin datos");
					}
					else
					{
						System.out.println("Contenido de la tabla:");
						for(j=0;j<i;j++)
						{
							System.out.println(numeros[j]);
						}
					}
					System.out.println(i);
					
				break;
				
				case 3:
					System.out.println("Introduzca numero");
					num=sc.nextInt();
					
					for(j=0;j<i && numeros[j]!=num;j++);
					
					if(i==j)
					{
						System.out.println("No encontrado");
					}
					else
					{
						for(int k=j; k<i-1; k++)
						{
							numeros[k]=numeros[k+1];
						}
						i--;
					}
					
					
				break;
				
				case 4:
					i=0;
					
				break;
				
				case 5:
				break;
				
				default:
					System.out.println("Opción incorrecta");
				break;
			}
			
		}while(opcion!=5);
		
	}

}
