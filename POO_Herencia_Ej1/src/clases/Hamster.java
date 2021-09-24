package clases;

public class Hamster extends Mascota
{
	//Campos
	public String colorPelo;
	public String marcaPienso;
	
	//Constructores
	public Hamster(String nombre, int edad, String colorPelo, String marcaPienso) {
		super(nombre, edad);//Esto se debe a que Hamster hereda de Mascota, se introduce por tanto su constructor
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}
	public Hamster() {
		super();
	}
	
	//De nuevo debemos redefinir el método toString de Mascota
	@Override
	public String toString ()
	{
		String texto;
		texto=super.toString() //Podemos utilizar el toString de la clase Mascota.
				+ "Color pelo: "+ this.colorPelo+ "\n"
				+ "Marca pienso: "+ this.marcaPienso+ "\n";
		return(texto);		
	}
	
	
	
}
