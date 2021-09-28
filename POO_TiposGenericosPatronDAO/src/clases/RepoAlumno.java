package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.ICRUD;

public class RepoAlumno implements ICRUD<Alumno,Integer>//Para meter el tipo genérico, no pueden ser tipos primarios.
{
		
	public HashMap<Integer,Alumno> listado;
	
	public RepoAlumno()
	{
		listado=new HashMap<Integer,Alumno>();
	}
	
	//Metodos
	@Override
	public void nuevo(Alumno cl) {
		this.listado.put(cl.matricula, cl);
	}

	@Override
	public Alumno leer(Integer id) {
		Alumno alumno=this.listado.get(id);
		
		return alumno;
	}

	@Override
	public ArrayList<Alumno> listar() {
		return null;
	}

	@Override
	public void editar(Integer id, Alumno cl) {
		this.listado.put(id, cl); //Recordar que en HashMap no hay duplicados, se modifica de la siguiente manera.
	}

	@Override
	public void eliminar(Alumno cl) {
		this.listado.remove(cl.matricula);
	}

	@Override
	public HashMap<Integer, Alumno> listar2() {
		return listado;
	}

	@Override
	public void eliminar2(Integer id) {
		if(this.listado.remove(id)==null)
		{
			System.out.println("No se ha eliminado porque no se encuentra.");
		}
		else
		{
			System.out.println("Eliminado");
		}
		
	}
}
