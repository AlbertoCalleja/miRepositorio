package clases;

public class Vacaciones {

		//Campos
		protected int dias; //No permite acceder desde fuera de la clase pero si permite ser heredado
		private String destino; //No se puede acceder desde fuera de la clase. Si que podremos acceder mediante métodos o los constructores
		public boolean playa;
		
		//Constructores
		public Vacaciones(int dias, String destino, boolean playa) {
			this.dias = dias;
			this.destino = destino;
			this.playa = playa;
		}

		public Vacaciones() 
		{
		}

		/*public Vacaciones(int dias, String destino) {
		*this.dias = dias;
		*	this.destino = destino;
		*}
		*/
		public void mostrar ()
		{
			String texto;
			
			texto = "Dias: " + this.dias +"\n"+
					"Destino: "+ this.destino+ "\n"+
					"Playa: "+ ((this.playa==true)?"Si":"No"); //Esto sería un if abreviado, si playa fuese true, devolverá Si, sino No.
			System.out.println(texto);
		}
		
		
		
		
		
}
