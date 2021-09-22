package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		/*Mostras las 10 primeras tablas de multiplicar
		*
		*Alberto Calleja Pascual
		*22-09-2021
		*/
		
		int sumaTabla=0;
		int resultado;
		
		
		for(int i =1;i<=10;i++)
		{
			sumaTabla=0;
			System.out.println("==============");
			System.out.println("Tabla del "+i);
			System.out.println("==============");
			for(int j=1; j<=10; j++)
			{
				resultado=i*j;
				System.out.println(i+" X "+j+" = "+resultado);
				sumaTabla+=resultado;
			}
			System.out.println("La suma de la tabla es: "+sumaTabla);
		}
		

	}

}
