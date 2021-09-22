package paquete;

import java.util.Random;

public class Ejecuta {

	public static void main(String[] args) {
		int segundos=0;
		int aleatorio;
		Random r= new Random ();
		
		for(int corredor=1;corredor<=3; corredor++)
		{
			segundos=0;
			aleatorio=r.nextInt(20)+1;
			for(;segundos<aleatorio;segundos++)
			{
				//?
			}
			
			if(segundos<10)
			{
				System.out.println("Rápido");
			}
			else
			{
				System.out.println("Lento");
			}
				
		}

	}

}
