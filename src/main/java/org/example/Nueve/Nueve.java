package org.example.Nueve;

public class Nueve {
	public static void main(String[] args) {

		/*
		 * Del texto, “La sonrisa sera la mejor arma contra la tristeza”
		 * Reemplaza todas las a del String anterior por una e, adicionalmente
		 * concatenar a esta frase una adicional que ustedes quieran incluir
		 * por consola y las muestre luego unidas.
		 */

		String texto = "La sonrisa sera la mejor arma contra la tristeza";

		String nuevoTexto = texto.replace("a", "e");

		System.out.println(nuevoTexto);

	}
}
