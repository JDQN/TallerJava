package org.example.Diez;

import java.util.Scanner;

public class Diez {

	public static void main(String[] args) {


		/*
		* Realizar una aplicación de consola, que al ingresar una
		* frase por teclado elimine los espacios que esta contenga.
		*/

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese una frase: ");
		String frase = sc.nextLine();

		
		String fraseSinEspacios = frase.replace(" ", "");
		System.out.println("Frase sin espacios: " + fraseSinEspacios);

		sc.close();

	}
}
