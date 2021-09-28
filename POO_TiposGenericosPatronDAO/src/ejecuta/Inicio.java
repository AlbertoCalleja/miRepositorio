package ejecuta;

import java.util.HashMap;
import java.util.Scanner;

import clases.Alumno;
//import clases.Articulo;
import clases.RepoAlumno;
//import clases.RepoArticulo;

public class Inicio {

	public static void main(String[] args) {
		
		//RepoArticulo repoArt=new RepoArticulo();
		//Articulo articulo1= new Articulo("a123","Monitor",300F);
		//Articulo articulo2= new Articulo("a456","Teclado",200F);
		//Articulo art; as
		
		RepoAlumno repoAlumno = new RepoAlumno();
		Scanner sc= new Scanner(System.in);
		int matricula;
		int opcion;
		Alumno alum;
		HashMap<Integer,Alumno> datos;
		String menu= "--MENU ALUMNOS--"+"\n"
				+ "1. Listar"+"\n"
				+ "2. Leer alumno\n"
				+ "3. Eliminar \n"
				+ "4. Editar\n"
				+ "5. Nuevo\n"
				+ "6. Salir\n\n";
		
		do {
			System.out.println(menu);
			System.out.println("Introduzca una opcion:");
			
			opcion=Integer.valueOf(sc.nextLine());
			
			switch(opcion)
			{
			case 1:
				datos=repoAlumno.listar2();
				for(int matri: datos.keySet())//Recorremos el HashMap
				{
					alum=datos.get(matri);
					System.out.println(alum.toString());
				}
				break;
			
			case 2:
				System.out.println("Introduzca matricula");
				matricula=Integer.valueOf(sc.nextLine());
				alum=repoAlumno.leer(matricula);
				
				if(alum==null)
				{
					System.out.println("No encontrado.");
				}
				else {
					System.out.println(alum.toString());
				}
				break;
				
			case 3:
				System.out.println("Introduzca matricula: ");
				matricula=Integer.valueOf(sc.nextLine());

				repoAlumno.eliminar2(matricula);//Recordar que el método eliminar tiene como paramtero un objeto. Pero vamos a usar el 2
				break;
				
			case 4:
				System.out.println("Introduzca matricula");
				matricula=Integer.valueOf(sc.nextLine());

				Alumno almn= new Alumno ();
				System.out.println("A continuación introduzca los datos modificados");
				System.out.println("\tMatricula: ");
				almn.matricula=Integer.valueOf(sc.nextLine());
				System.out.println("\tNombre: ");
				almn.nombre=sc.nextLine();
				
				repoAlumno.editar(matricula, almn);
				
				break;
				
			case 5:
				
				Alumno almns= new Alumno ();
				System.out.println("A continuación introduzca los datos del nuevo alumno");
				System.out.println("\tMatricula: ");
				almns.matricula=Integer.valueOf(sc.nextLine());
				System.out.println("\tNombre: ");
				almns.nombre=sc.nextLine();
				
				repoAlumno.nuevo(almns);
				break;
				
			case 6:
				System.out.println("Hasta pronto");
				break;
				
			default :
				System.out.println("Introduzca una opción válida.");
				break;
			}
			
			
		}while(opcion!=6);
		
		
		sc.close();
		
		
		
		//CODIGO PROGRAMADO PARA REPOARTICULO
		//repoArt.nuevo(articulo1);
		//repoArt.nuevo(articulo2);
		
		/*art= repoArt.leer("a456");
		System.out.println(art.toString());
		*/
		
		//repoArt.eliminar(articulo2);
		//
		//art=new Articulo ("a123","Teclado",22.5F);
		//repoArt.editar("a123", art);
		
		

		
	}

}
