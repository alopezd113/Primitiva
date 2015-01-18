package modelo;

import java.util.Arrays;
import java.util.Scanner;

public class BoletoPrimitiva3 {

	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
		
		int respuesta;

		
		System.out.println("Bienvenido ÀDesea jugar un boleto 1=automatico o 2=manual?");
		respuesta = teclado.nextInt();

		if (respuesta==1){
			int cuantoApuesta;
			System.out.println("Ha elegido AUTOMATICO, indique la cantidad de apuestas que desea jugar");
			cuantoApuesta = teclado.nextInt();
			
			/*********** poner automatico ***********/
			int[] quiniela=new int[cuantoApuesta];
			int cuantosTengo;
			//repetir hasta que tenga 6 nœmero
			cuantosTengo=0;
			while(cuantosTengo<6) {
			//generar nœmero [1-49]
			int aleatorio = (int) (Math.random() * 49 + 1);
			//mirar si est‡
			boolean est‡=false;
			for(int j=1;j<cuantosTengo;j++)
			if (aleatorio == quiniela[j]) est‡=true;
			//si esta, lo descarto
			//si no, lo guarda, tengo uno m‡s
			if (!est‡) {
			quiniela[cuantosTengo]=aleatorio;
			cuantosTengo++;
			}
			}
			System.out.println(Arrays.toString(quiniela));
			/**********************/
		}
		
		if (respuesta==2){
			int cuantoApuestaManual;
			System.out.println("Ha elegido MANUAL, indique las apuestas que desea jugar");
			cuantoApuestaManual = teclado.nextInt();
			
			
			int i;
		        
		     int[] boletoManual = new int[cuantoApuestaManual]; //array que contendr‡ los nœmeros le’dos por teclado
			
	        System.out.println("Indique el valor de su apuesta: ");
	        
	        	for (i = 1; i < 10; i++) {
	            System.out.print( + i + " apuesta = ");
	            boletoManual[i]=teclado.nextInt();

	        	}
	        	System.out.println("Su boleto es " + Arrays.toString(boletoManual));
			
	       

		}
	}

}
