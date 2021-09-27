package clases;

public class Vehiculo {
	
	//Campos
	public String tipo;
	public int peso;
	public String color;
	
	public Vehiculo()
	{
	}
	public Vehiculo(String tipo, int peso, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}
	
	
	//Metodos
	@Override
	public String toString() {
		//return String.format("Vehiculo [tipo=%s, peso=%s, color=%s]", tipo, peso, color);
		
		String texto;
		
		texto= "TIPO: "+this.tipo +"\n"
				+"PESO: "+this.peso+ "\n"
				+"COLOR: "+this.color+ "\n";
		
		return(texto);
	}
	
	public void mostrar(Vehiculo v)
	{
		Tren t;
		Coche c;
		
		if(v instanceof Coche)
		{
			c = (Coche) v;
			System.out.println(c.toString());
		}
		else
		{
			t= (Tren) v;
			System.out.println(t.toString());
		}
	}
	
	

}
