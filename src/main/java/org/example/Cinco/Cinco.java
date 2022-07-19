package org.example.Cinco;

public class Cinco {

	public static void main(String[] args) {
		/*
		* Muestra los números impares y pares del 1 al 100
		* (ambos incluidos). Usa un bucle while.
		*/

		Integer numerosImpares = 1;
		Integer numeroPar = 2;


		System.out.println("Numeros impares del 1 al 100");

		while(numerosImpares <= 100){
			numerosImpares = numerosImpares + 2;
			System.out.println("Numero impar: " +numerosImpares);
		}


		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


		System.out.println("Números pares del 1 al 100");
		while(numeroPar <= 100){
			if(numeroPar % 2 == 0){
				System.out.println("Numero par: " +numeroPar);
			}
			numeroPar++;
		}
	}
}
