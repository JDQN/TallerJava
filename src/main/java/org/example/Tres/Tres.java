package org.example.Tres;

import java.util.Scanner;


public class Tres {
	public static void main(String[] args) {

		/*
		* Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por
		* teclado (recuerda pasar de String a double con Double.parseDouble).
		* Usa la constante PI y el método pow de Math.
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al calculador del area de un circulo 🔘 ");

		System.out.println("Ingresa el radio del circulo 🔘 ");
		double radio=sc.nextDouble();

		double area = Math.PI*Math.pow(radio, 2);

		System.out.println("El area del circulo es " +area);

	}
}
