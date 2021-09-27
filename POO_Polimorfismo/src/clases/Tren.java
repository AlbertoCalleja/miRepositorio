package clases;

public class Tren extends Vehiculo{
	
	//Campos
	public int vagones;
	public boolean largoRecorrido;
	
	//Constructores
	public Tren(String tipo, int peso, String color, int vagones, boolean largoRecorrido) {
		super(tipo, peso, color);
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}
	public Tren() {
		super();
	}
	
	//Metodos
	@Override
	public String toString() {
		return  super.toString()+ "Nº Vagones: "+vagones+"\n"
				+"Largo recorrido "+ ((largoRecorrido==true)?"Sí":"No")+"\n\n";
	}
	
	
	
	

}
