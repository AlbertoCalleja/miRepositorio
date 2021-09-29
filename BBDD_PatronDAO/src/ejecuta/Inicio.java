package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.Alumno;
import repositorios.BaseDatos;
import repositorios.RepoAlumno;

public class Inicio {

	public static void main(String[] args) {
		/*servidor 185.224.138.154
		bbdd	u581554845_indra
		usuario	u581554845_alumno
		pass	Root1234
		*/	
		RepoAlumno repo= new RepoAlumno("185.224.138.154", "u581554845_alumno", "Root1234", "u581554845_indra");
		Alumno alumno= new Alumno ();
		Scanner sc= new Scanner(System.in);
		ArrayList<Alumno> datAlumnos = new ArrayList<Alumno>();
		
		/*System.out.println("Introduzca matricula: ");
		alumno.matricula=Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca nombre del alumno: ");
		alumno.nombre=sc.nextLine();
		System.out.println("Introduzca apellido del alumno: ");
		alumno.apellido=sc.nextLine();
		
		
		try {
			repo.nuevo(alumno);
			} 
		catch (Exception e) {
			System.out.println("No se ha añadido. Se ha producido un error.");		
			//System.err.println(); Mostraria un mensaje de error que el usuario no verá
			}
		*/
		
		/*try {
			datAlumnos= repo.listar();
		} catch (Exception e) {
			System.out.println("Error al mostrar.");
		}*/
	}
		
}
