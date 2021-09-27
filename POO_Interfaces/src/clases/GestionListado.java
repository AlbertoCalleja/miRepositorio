package clases;

import java.util.ArrayList;

import interfaces.IGestionListado;

public class GestionListado implements IGestionListado{
	
	//Constructores
	//=============
	public GestionListado ()
	{
		this.listado=new ArrayList<Integer>(); //Dado que es un arraylist debemos iniciarlo
	}
	
	//Campos
	//========
	public ArrayList<Integer> listado;
	
	//Metodos
	//=======
	@Override
	public void nuevo(int numero) {
		if(this.listado.size()==18)
		{
			System.out.println("No introducido. El listado esta lleno");
		}
		else if(this.listado.contains(numero)==true)
		{
			System.out.println("No introducido. Ya se encuentra en el listado");
		}
		else
		{
			this.listado.add(numero);	
			this.listado.sort(null);
		}
	}

	@Override
	public void listar() {
		if(this.listado.size()==0)
		{
			System.out.println("Listado vacío");
		}
		else
		{
			System.out.println("Contenido del listado: ");
			for(int i=0; i<listado.size(); i++)
			{
				System.out.println(listado.get(i));
			}
		}
	}

	@Override
	public void eliminar(Integer n) {
		listado.remove(n);		
	}

	@Override
	public void eliminar() {
		listado.clear();
	}
	
}
