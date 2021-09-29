package modelos;

public class Alumno {
		
	
	//Constructores
	//---------------
	public Alumno() {
	}	
	public Alumno(int matricula) {
		this.matricula = matricula;
	}
		
	public Alumno(int matricula, String nombre, String apellido) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Campos
	//-------
	public int matricula;
	public String nombre;
	public String apellido;
	

	//Metodos
	//--------
	@Override
	public String toString() {
		
		String text;
		
		text= "Matricula del alumno: "+this.matricula+"\n"
				+ "Nombre del alumno: "+this.nombre+"\n"
				+ "Apellido del alumno: "+this.apellido+"\n";
		
		return text;
		
		
	}
	
	
}
