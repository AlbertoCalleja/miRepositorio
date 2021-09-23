package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
		Alumno alumno1;
		Alumno alumno2;
		String nombreCompleto;
		int n1;
		
		alumno1=new Alumno();
		
		alumno1.nombre="David";
		alumno1.apellido1="Sanz";
		alumno1.apellido2="Pérez";
		
		alumno2= new Alumno("Marcos","Jiménez","García");
		
		//Podriamos mostrar el nombre del alumno por pantalla directamente (aunque no es recomendable)
		//nombreCompleto= "NOMBRE:" + alumno1.nombre + "\n" +
		//		"APELLIDO: "+alumno1.apellido1+ "\n"+
		//		"APELLIDO 2: "+alumno1.apellido2;
		//System.out.println(nombreCompleto);
		//Será lo normal utilizar un método de la clase Alumno para hacerlo.
		
		alumno1.mostrar();
		alumno2.mostrar();
		
		n1=alumno1.sumarNotas(9, 6);
		//Podriamos probar también el suma con float
		
		
	}

}
