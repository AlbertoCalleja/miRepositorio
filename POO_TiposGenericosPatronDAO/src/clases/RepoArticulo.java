package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.ICRUD;

public class RepoArticulo implements ICRUD<Articulo,String>
{
	
	//Campos
	public ArrayList<Articulo> listado;
	
	//Constructor
	public RepoArticulo() //Repositorio para el modelo Artículo.
	{
		this.listado=new ArrayList<Articulo>();
	}

	//Metodos
	@Override
	public void nuevo(Articulo cl) {
		this.listado.add(cl);
	}

	@Override
	public Articulo leer(String id) {
		Articulo articulo=null;
		//Busqueda secuencial
		for(int i=0; i<listado.size();i++)
		{
			articulo=listado.get(i);
			if(articulo.referencia.equals(id)==true)
			{
				break;
			}
		}
		//articulo=listado.()
		
		
		return articulo;
	}

	@Override
	public ArrayList<Articulo> listar() { //OBSERVACIÓN: Estariamos utilizando polimorfismo, ya que ArrayList hereda de List.
		
		return listado;
	}

	@Override
	public void editar(String id, Articulo cl) {
		boolean ok=false;
		Articulo articulo;
		
		for(int i=0;i<listado.size();i++)
		{
			articulo=listado.get(i);
			
			
				if(articulo.referencia.equals(id)==true)
				{
					listado.set(i, cl);
					ok=true;
				}
		}
		if(ok==true)
		{
			System.out.println("Modificado");
		}
		else
		{
			System.out.println("No encontrado, luego no se ha podido modificar.");
		}
		
		
	}

	@Override
	public void eliminar(Articulo cl)
	{
		
		/*boolean ok;
		
		ok=this.listado.remove(cl);//Requiere redefinir equals de Articulo
		
		if(ok==true)
		{
			System.out.println("Eliminado");
		}
		else
		{
			System.out.println("No eliminado. El objeto no existe en el repositorio");
		}*/
		Articulo articulo;
		boolean ok=false;
		
		for(int i=0;i<listado.size();i++)
		{
			articulo=this.listado.get(i);
			if(articulo.referencia.equals(cl.referencia)==true)
			{
				listado.remove(i);
				ok=true;
				break; //Dado que al eliminar cambia el tamaño de listado y esto podría dar problemas.
			}
		}
		if(ok==true)
		{
			System.out.println("Eliminado");
		}
		else
		{
			System.out.println("No encontrado. No se ha podido eliminar.");
		}
	}

	@Override
	public HashMap<String,Articulo> listar2()
	{
		return null;
	}

	@Override
	public void eliminar2(String id) {
		// TODO Auto-generated method stub
		System.out.println("Este metodo aquí no hace nada");
		
	}

	
}
