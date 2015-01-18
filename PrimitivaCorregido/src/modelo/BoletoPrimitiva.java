package modelo;

import java.util.Random;

public class BoletoPrimitiva {

		private int [] combinacion;
		
		public BoletoPrimitiva(int numeroApuestas){
			combinacion= new int [numeroApuestas];
			for(int i=0; i<combinacion.length; i++)
				combinacion [i]=0;
				//System.out.println(combinacion [i]);
			Random aleatorio = new Random ();
			int contadorApuestas=0;
			while (contadorApuestas<numeroApuestas){
				int numeroAleatorio=aleatorio.nextInt (49)+1;
				if (!haSalido(numeroAleatorio)){
					combinacion [contadorApuestas]=numeroAleatorio;
					contadorApuestas++;
				} 
			}
			
			
			/*for (int i=0 ;i<numeroApuestas; i++){
				combinacion [i]=aleatorio.nextInt(49)+1;				
			}*/
			
			//System.out.println(Arrays.toString(combinacion));
		}
		

		
		
		
		/*********************************/
		
		public boolean haSalido (int numero) {
			boolean encontrado=false;
			int i=0;
			while (i<combinacion.length&&!encontrado){
				if (combinacion [i]==numero)
					encontrado=true;
			i++;
			
		}
			return encontrado;
		}
		/*********************************/
		
		public int[] getCombinacion() {
			return combinacion;
		}

		public void setCombinacion(int[] combinacion) {
			this.combinacion = combinacion;
		}

		/*********************************/
		public void imprimirCombinacion(){
			for(int i=0; i < combinacion.length; i++)
				System.out.printf(combinacion [i] + "-");
		}
		/*********************************/
		
		public int getAciertos(int[]combinacionGanadora){
			return 0;
			
		}
		/*********************************/
		
}
