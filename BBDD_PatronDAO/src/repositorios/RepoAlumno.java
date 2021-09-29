package repositorios;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelos.Alumno;

public class RepoAlumno extends BaseDatos implements ICRUD<Alumno,Integer>{

	//Constructores
	//============
	public RepoAlumno (String servidor, String usuario, String password, String baseDatos)
	{
		super(servidor,usuario,password,baseDatos);
	}
	
	//Campos
	//=======
	private String sql;
	private PreparedStatement ps;
	private Statement stmt;
	private ResultSet rs;
	
	//Metodos
	//=======
	@Override
	public ArrayList<Alumno> listar() throws Exception {
		
		Alumno al;
		ArrayList<Alumno> datos= new ArrayList<Alumno>();
		
		super.conectar();
		
		this.stmt=super.conexion.createStatement();
		this.sql="SELECT matricula, nombre, apellido FROM Alumno;";
		rs=this.stmt.executeQuery(sql);
		
		while(rs.next()!=false)//rs devuelve verdadero si hay algo valido en la siguiente fila de la tabla de la BD
		{
			al=new Alumno (rs.getInt("matricula"),rs.getString("nombre"),rs.getString("apellido"));
			System.out.println(al.toString());
			datos.add(al);
		}
		
		super.desconectar();
		
		return datos;
	}
	@Override
	public Alumno leer(Integer pk) throws Exception
	{
		
		super.conectar();
		Alumno alumnoAux = new Alumno();

		
		this.sql="SELECT matricula, nombre, apellido FROM Alumno WHERE matricula=?";
		this.ps= super.conexion.prepareStatement(sql);
		this.ps.setInt(1, pk);
		this.rs=this.ps.executeQuery();
		
		if( this.rs.next() == true )
		{
			
			alumnoAux.matricula = rs.getInt("matricula");
			alumnoAux.nombre = rs.getString("nombre");
			alumnoAux.apellido = rs.getString("apellido");
			
			System.out.println( alumnoAux.toString() );
		}
		else
		{
			System.out.println("\n Alumno no encontrado.");
		}
		
		super.desconectar();
		
		
		
		return alumnoAux;
	}
	@Override
	public void nuevo(Alumno modelo) throws Exception 
	{
			int cantidad;//Filas insertadas en la tabla de la base de datos
		
			conectar();
			
			this.sql = "INSERT INTO Alumno(matricula, nombre, apellido) VALUES (?,?,?)";
			this.ps= super.conexion.prepareStatement(sql);
			
			this.ps.setInt(1, modelo.matricula);
			this.ps.setString(2, modelo.nombre);
			this.ps.setString(3, modelo.apellido);
			
			cantidad=this.ps.executeUpdate();
			
			if(cantidad==1)
			{
				System.out.println("Guardado");
			}
			else
			{
				System.out.println("No se ha podido guardar");
			}
			super.desconectar();
	}
	@Override
	public void editar(Integer pk, Alumno modelo) throws Exception{
		
		int cantidad;
		super.conectar();
		
		sql= "UPDATE Alumno SET"+
				"matricula = ?, nombre= ?, apellido= ?"
				+"WHERE matricula = ?";
		ps=super.conexion.prepareStatement(sql);
		ps.setInt(1, modelo.matricula);
		ps.setString(2, modelo.nombre);
		ps.setString(3, modelo.apellido);
		ps.setInt(4, pk);
		
		cantidad=ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Alumno actualizado.");
		}
		else
		{
			System.out.println("No se ha podido modificar. No se ha encontrado esa matricula como registrada.");
		}
		
		super.desconectar();
	}
	@Override
	public void eliminar(Integer pk) throws Exception
	{
		
		int cantidad;
		super.conectar();
		
		this.sql="DELETE FROM Alumno "+
				"WHERE matricula =?";
		ps=super.conexion.prepareStatement(sql);
		ps.setInt(1, pk);
		
		cantidad=ps.executeUpdate();
		
		if(cantidad==0)
		{
			System.out.println("No se ha podido eliminar. No se ha encontrado alumno con esa matricula.");
		}
		else
		{
			System.out.println(cantidad+" alumno quitado.");
		}
		
		super.desconectar();
		
		
	}
	
	
	
	
	
	
}
