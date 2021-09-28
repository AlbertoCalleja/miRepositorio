package clases;

public class Alumno {
		
	public int matricula;
	public String nombre;
	public Alumno(int matricula, String nombre) {
		this.matricula = matricula;
		this.nombre = nombre;
	}
	public Alumno(int matricula) {
		this.matricula=matricula;
	}
	public Alumno()
	{
		
	}
	@Override
	public String toString() {
		return "Matricula del alumno: "+this.matricula+"\n"
				+"Nombre del alumno: "+this.nombre+"\n\n";
	}
	@Override
	public boolean equals(Object obj) {
		return (((Alumno) obj).matricula==this.matricula);
	}
	
	
	
	
}
