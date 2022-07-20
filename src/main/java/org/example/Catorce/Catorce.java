package org.example.Catorce;

import java.util.Scanner;

public class Catorce {

	public static void main(String[] args) {

		/*
		* Crear un programa que pida un numero por teclado y que imprima
		* por pantalla los números desde el numero introducido hasta 1000
		* con saltos de 2 en 2.
		*/

		System.out.println("Ingresa un numero");

		Scanner sc = new Scanner(System.in);
		Integer inputNumero = sc.nextInt();

		Integer numero = inputNumero;

		while(numero <= 1000){
			System.out.println(numero);
			numero = numero + 2;
		}
	}
}
