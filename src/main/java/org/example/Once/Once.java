package org.example.Once;

import java.util.Scanner;

public class Once {

	/*
	*	Realizar la construcción de un algoritmo que permita de acuerdo a
	* una frase pasada por consola, indicar cual es la longitud de esta frase,
	* adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
	*/

	public static void main(String[] args) {

		System.out.println("Por favor ingrese una frace");
		Scanner frace = new Scanner(System.in);
		String fraceCompleta = frace.nextLine();

		Integer contador = 0;
		for(Integer i=0; i<fraceCompleta.length(); i++){

			if(fraceCompleta.charAt(i) == 'a' ||
						fraceCompleta.charAt(i) == 'e' ||
						fraceCompleta.charAt(i) == 'i' ||
						fraceCompleta.charAt(i) == 'o' ||
						fraceCompleta.charAt(i) == 'u'
			){
				contador++;
			};
		}

		System.out.println("La frace es: " + fraceCompleta +
					"\nTu frace tiene " +fraceCompleta.length()+ " Caracteres"+
					"\nTu frace tiene: " +contador+ " Vocales" );
	}
}
