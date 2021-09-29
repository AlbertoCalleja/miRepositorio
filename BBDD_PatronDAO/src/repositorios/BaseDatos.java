package repositorios;
//STA CLASE CONECTA CON LA BASE DE DATOS EXTERNA A ECLIPSE.
import java.sql.Connection;
import java.sql.DriverManager;


public class BaseDatos {
	
	//Constructores
	//=============
	public BaseDatos (String servidor, String usuario,String password, String baseDatos)
	{
		this.cadenaConexion="jdbc:mysql://" + servidor + "/" + baseDatos 
				   + "?user=" + usuario + "&password=" + password 
				   + "&autoReconnect=true";
;
	}
	
	
	//Campos
	//======
	public Connection conexion;
	private String cadenaConexion;
	
	//Metodos
	//=========
	public Connection conectar() throws Exception //Si se produce un error trabajando con estos comandos se lanza un error
	{
		this.conexion=DriverManager.getConnection(this.cadenaConexion);
		//Connection conexion =DriverManager.getConnection(this.cadenaConexion);
		System.out.println("Conectado!!");
		return conexion;
	}
	
	public void desconectar () throws Exception
	{
		if(this.conexion!=null && this.conexion.isClosed()==false)
		{
			this.conexion.close();
		}
	}
}
