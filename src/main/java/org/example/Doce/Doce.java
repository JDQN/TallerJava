package org.example.Doce;

import java.util.Scanner;

public class Doce {

	public static void main(String[] args) {

		/*
		*  Pedir dos palabras por teclado, indicar si son
		*  iguales, sino son iguales mostrar sus diferencias.
		*/

		System.out.println("Ingrese la primera palabra");
		Scanner palabraUno = new Scanner(System.in);
		String InputPalabraUno = palabraUno.nextLine();


		System.out.println("Ingrese la segunda palabra");
		Scanner palabraDos = new Scanner(System.in);
		String InputPalabraDos = palabraDos.nextLine();

		if(InputPalabraUno.equals(InputPalabraDos)){
			System.out.println("Las palabras son iguales");
		}else{
			System.out.println("Las palabras son diferentes");
		}
		
	}
}
