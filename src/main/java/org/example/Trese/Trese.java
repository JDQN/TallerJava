package org.example.Trese;

import java.util.Scanner;

public class Trese {

	/*
	* Realizar un algoritmo que permita consulta la fecha y hora actual en el formato
	* (AAAA/MM/DD) (HH:MM:SS)
	*/

	public static void main(String[] args) {
		System.out.println("Escoje 1 para saver la fecha y hora actual y 2 para salir");
		Scanner opcion = new Scanner(System.in);
		Integer opciones = opcion.nextInt();

		switch (opciones){
			case 1:
				System.out.println("La fecha actual es: " + java.time.LocalDate.now());
				System.out.println("La hora actual es: " + java.time.LocalTime.now());
				break;

			case 2 :
				System.out.println("Gracias por participar");
				break;

			default:
				System.out.println("Porfavor escoja una obcion correcta");
				break;
		}
	}
}