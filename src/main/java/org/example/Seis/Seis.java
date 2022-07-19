package org.example.Seis;

public class Seis {
	public static void main(String[] args) {

		/*
		* Realiza el ejercicio anterior usando un ciclo for.
		*/

		Integer numerosImpares = 1;
		Integer numeroPar = 2;

		System.out.println("Numeros impares del 1 al 100");

		for(int i = 0; i < 100; i++) {
			if(numerosImpares % 2 != 0) {
				System.out.println("Numero Par: " +numerosImpares);
			}
			numerosImpares++;
		}

		System.out.println("Numeros pares del 1 al 100");
		for(int i = 0; i < 100; i++) {
			if(numeroPar % 2 == 0) {
				System.out.println("Numero Impar: " +numeroPar);
			}
			numeroPar++;
		}
	}
}
