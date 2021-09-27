package clases;

public class Coche extends Vehiculo{
	
	//Campos
	public boolean camara;
	//public String combustible;
	public ECombustibles combustible;
	
	//Constructores
	public Coche(boolean camara, ECombustibles combustible,
			String tipo, int peso, String color) {
		super(tipo,peso,color); //Esto lo hacemos porque estamos pidiendo los parámetros en la firma
		
		this.camara = camara;
		this.combustible = combustible;
	}

	//Realmente se llamará a super() de todas formas
	public Coche() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "Combustible: "+ this.combustible+ "\n"
				+ "Camara_ "+ ((this.camara==true)?"Sí":"No")+ "\n\n";
	}
	
	
	//Metodos
	
	
}
