package clases;


/*
 * PRIVATE: No permite acceder fuera de la clase
 * PUBLIC: Se puede acceder desde fuera de la clase
 * PROTECTED: Permite heredar pero no acceder desde objeto, siempre que estén en el mismo paquete
 */
public class Mascota extends Object
{
	public String nombre;
	public int edad;
	
	//Constructores
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Mascota() {
	}
	
	//Metodos
	
	//... Getters, setters.	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override//Estariamos sobreescribiendo el metodo toString de la super clase Object
	public String toString ()
	{
		String texto;
		
		texto= "Nombre: "+this.nombre+"\n"+
				"edad: "+this.edad;
		return(texto);
	}
	
	
	
}
