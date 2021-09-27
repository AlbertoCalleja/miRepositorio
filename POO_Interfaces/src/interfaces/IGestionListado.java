package interfaces;

public interface IGestionListado {
	
	public abstract void nuevo(int numero); //Podemos poner publico, privado o nada
	void listar(); //Estamos declarando de manera automática como public abstract.
	void eliminar(Integer n); // En ArrayList si pasamos un int, elimina por indice
	void eliminar(); //Seria el método eliminar todos, estamos realizando una sobrecarga
	
	
}
