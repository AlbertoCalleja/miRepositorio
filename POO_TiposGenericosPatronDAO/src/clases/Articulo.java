package clases;

public class Articulo {

	//Campos
	public String referencia; //PK
	public String nombre;
	public float precio;
	
	//Constructores
	public Articulo(String referencia, String nombre, float precio) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}
	public Articulo() {
	}
	
	//Metodos
	@Override
	public String toString ()
	{
		return "Referencia: "+this.referencia+"\n"
				+"Nombre: "+this.nombre+"\n"
				+"Precio: "+this.precio+"\n\n";
	}
	@Override
	public boolean equals(Object obj) //Comparamos por referencia
	{
	
		return((Articulo)obj).referencia.equals(this.referencia);
	}
	
	
}
