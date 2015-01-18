package modelo;

import java.util.Scanner;

public class BoletoPrimitiva2 {

	@SuppressWarnings("unused")
	public static void main(String[] args, int numeroApuestas) {
		Scanner teclado = new Scanner (System.in);
		
		String respuesta;
		String automatico = null;
		String manual= null;
		
		System.out.println("Bienvenido ÀDesea jugar un boleto automatico o manual?");
		respuesta = teclado.nextLine();
		
		if (respuesta==automatico){
			
		}
		if (respuesta==manual){
			int [] combinacion;
			combinacion = new int [numeroApuestas];
			System.out.println("Cuantos numeros desea apostar? (minimo 6)");
			numeroApuestas = teclado.nextInt();
		}
			
	}

}
