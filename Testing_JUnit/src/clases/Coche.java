package clases;

import java.util.Random;

public class Coche
{
	public int acelerar(int velocidad)
	{
		//Miscelanea: El return hace que devolver tenga prioridad frente al sumar 1return velocidad++;//Miscelanea: El return hace que devolver tenga prioridad frente al sumar 1
		//MUCHO CUIDADO, en la sentencia resultado=velocidad++, resultado valdría velocidad sin incrementar.
		return ++velocidad; //Aquí ya sumaría primero y despues devolvería la variable+1
	}
	public boolean multa()
	{
		Random r= new Random();
		boolean resultado = r.nextBoolean();
		
		return resultado;
		
	}
}
