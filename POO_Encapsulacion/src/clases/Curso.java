package clases;

public class Curso {
	
	//Campos
	private String nombre;
	private int horas;
	private String academia;
	
	//Metodos
	
	//Constructores
	public Curso ()
	{
		/*
		this.nombre="";
		this.horas=0;
		this.academia="";
		CUIDADO No es lo mismo, estariamos invocando a los metodos set, estos podrían utilizar bucles o estructuras de control
		*/
		setNombre("");
		setHoras(0);
		setAcademia("");
	}
	public Curso(String nom, int hor, String acad)
	{
		setNombre(nom);
		setHoras(hor);
		setAcademia(acad);
	}
	
	
	
	
	
	//Getters
	public String getNombre ()
	{
		if(this.nombre.equals("")==true)
		{
			return "Sin nombre";
		}
		else
		{
			return this.nombre.toUpperCase();
		}
	}
	public int getHoras()
	{
		return this.horas;
	}
	public String getAcademia ()
	{
		return this.academia;
	}
	
	//Setters
	public void setNombre (String p_nombre){
		nombre=p_nombre;
	}
	public void setHoras (int p_horas){
		if(p_horas<0)
		{
			System.out.println("Las horas no pueden ser negativas");
		}
		else
		{
			horas = p_horas;
		}
	}
	public void setAcademia (String p_academia) {
		this.academia=p_academia;
	}
	
}
