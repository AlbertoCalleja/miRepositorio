package ejecuta;

import clases.Curso;

public class Inicio {

	public static void main(String[] args) {
		
		Curso java = new Curso();
		
		/*java.setAcademia("Experiencias"); Otra manera
		java.setHoras(90);
		java.setNombre("CursoMatemáticas");
		
		System.out.println(java.getNombre());
		System.out.println(java.getHoras());
		System.out.println(java.getAcademia());
		*/
		
		Curso git = new Curso ("GitHub",10,"Expereincais");
				
		System.out.println(git.getNombre());
		System.out.println(git.getHoras());
		System.out.println(git.getAcademia());
	}

}
