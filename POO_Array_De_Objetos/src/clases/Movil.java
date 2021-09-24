package clases;

public class Movil 
{
	//Campos
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	//Constructores
	public Movil(int memoria, String marca, int tamanoPantalla) {
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
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
	
	
}
