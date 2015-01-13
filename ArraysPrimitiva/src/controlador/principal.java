package controlador;

import java.util.Arrays;

public class principal {

	

	int[] quiniela=new int[6];
	int boleto=0;{
	
	//repetir hasta que tenga 6 nœmero
	while(boleto<6) {
	//generar nœmero [1-49]
	int aleatorio = (int) (Math.random() * 49 + 1);
	//mirar si est‡
	boolean est‡=false;
	for(int j=0;j<boleto;j++)
	if (aleatorio == quiniela[j]) est‡=true;
	//si esta, lo descarto
	//si no, lo guarda, tengo uno m‡s
	if (!est‡) {
	quiniela[boleto]=aleatorio;
	boleto++;
	}
	}
	
	System.out.println(Arrays.toString(quiniela));
}
}