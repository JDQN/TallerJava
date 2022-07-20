package org.example.Ocho;

import java.util.Scanner;

public class Ocho {


	public static void main(String[] args) {

		/*
		* Crea una aplicación por consola que nos pida un día de la semana
		* y que nos diga si es un día laboral o no. Usa un switch para ello.
		*/

		System.out.println("Por favor ingrese un dia de la semana");
		Scanner semana = new Scanner(System.in);
		String dia = semana.nextLine();

		switch(dia){
			case "Lunes":
				System.out.println("El dia Lunes es un dia Laboral");
				break;

			case "Martes":
				System.out.println("El dia Martes es un dia Laboral");
				break;

			case "Miercoles":
				System.out.println("El dia Miercoles es un dia Laboral");
				break;

			case "Jueves":
				System.out.println("El dia Jueves es un dia Laboral ya casi se termina la semana");
				break;

			case "Viernes":
				System.out.println("El dia Viernes es el ultimo dia de la semana Laboral");
				break;

			case "Sabado":
				System.out.println("El dia Sabado Solo se trabaja asta medio dia 2 veces por mes" );
				break;

			case "Domingo":
				System.out.println("El dia Domingo es para dormir como pata inchada comer helado y compartir en Familia");
				break;

			default:
				System.out.println("Dia de la semana incoprrecto");
				break;
		}
	}
}
