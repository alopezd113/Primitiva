package controlador;

import modelo.BoletoPrimitiva;

public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BoletoPrimitiva combinacionFernando = new BoletoPrimitiva(6);
		
		BoletoPrimitiva combinacionCristina = new BoletoPrimitiva(8);
		combinacionCristina.imprimirCombinacion();

	}

}
