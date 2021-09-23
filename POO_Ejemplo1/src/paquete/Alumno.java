package paquete;

public class Alumno {
		
		//Campos o propiedades
		public String nombre;
		public String apellido1;
		public String apellido2;
		
		//Constructores
		public Alumno ()
		{
			
		}
		
		public Alumno (String nombre, String apellido1, String apellido2)
		{
			this.nombre=nombre;
			this.apellido1=apellido1;
			this.apellido2=apellido2;
		}
		
		//Mostrar
		public void mostrar()
		{
			String nombreCompleto;
			
			nombreCompleto= "NOMBRE:" + this.nombre + "\n" +
							"APELLIDO: "+this.apellido1+ "\n"+
							"APELLIDO 2: "+this.apellido2;
					System.out.println(nombreCompleto);
		}
		
		public int sumarNotas (int nota1, int nota2)
		{
			int resultado;
			
			resultado=nota1+nota2;
			
			return resultado;
			
		}
		//sobrecarga
		public float sumarNotas (float n1, float n2)
		{
			float resultado;
			
			resultado= n1+n2;
			
			return resultado;
		}
}
