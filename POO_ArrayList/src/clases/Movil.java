package clases;

public class Movil 
{
	//Campos
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	private int imei;
	
	//Constructores
	public Movil(int memoria, String marca, int tamanoPantalla, int imei) {
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
		this.imei=imei;
	}
	public Movil()
	{
		
	}
	
	
	//Metodos
	//=======
	
	//Getter y setters
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	//Redefinidos
	@Override
	public String toString ()
	{
		String texto;
		
		texto= "Nombre: "+this.marca+"\n"
				+ "Memoria RAM:"+ this.memoria+"\n"
				+ "Tamaño de pantalla: "+this.tamanoPantalla;
		return(texto);
	}
	
	//...estándar
	//Método que aumenta en 1GB la memoria
	public void aumentaMemoria()
	{
		this.memoria++;
	}
	public boolean equals(Object objetoCompara)
	{
		Movil movilCompara= (Movil) objetoCompara;//Estamos convirtiendo el tipo Object a Movil, esto es posible porque Movil
		// hereda de Object, luego Object puede convertirse a cualquier clase, dado que todas las clases heredan de Object POLIMORFISMO
		boolean iguales= this.imei==movilCompara.imei;
		
		
		return iguales;
	}
	
	
}
