package org.example.Cuatro;

import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {

		/*
		* Lee un número por teclado que pida el precio de un producto (puede tener decimales)
		* y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
		*/

		/*Con final declaramos una constante*/
		final double iva = 0.21;

		System.out.println("Por favor ingrese el precio del producto");
		Scanner sc = new Scanner(System.in);
		double precio = Double.parseDouble(sc.nextLine());

		double precioFinal = precio + (precio*iva);
		System.out.println("El precio final del producto con iva incluido es de: " +precioFinal);

	}
}
