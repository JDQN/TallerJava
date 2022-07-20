package org.example.Quince;

import java.util.Scanner;

public class Quince {

	public static void main(String[] args) {

		/*
		  	Hacer un programa que muestre el siguiente menú de opciones
				****** GESTION CINEMATOGRÁFICA ********
				1-NUEVO ACTOR, 2-BUSCAR ACTOR, 3-ELIMINAR ACTOR
				4-MODIFICAR ACTOR, 5-VER TODOS LOS ACTORES, 6- VER PELICULAS DE LOS ACTORES
				7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES, 8-SALIR
				EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE
				UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN
				NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO".
				Y MOSTRAR EL MENU NUEVAMENTE. PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
		*/

		System.out.println("Ingresa una de las opciones del menu");
		Scanner inputMenu = new Scanner(System.in);

		System.out.println(
					"1-NUEVO ACTOR \n"+
					"2-BUSCAR ACTOR \n"+
					"3-ELIMINAR ACTOR \n"+
					"4-MODIFICAR ACTOR \n"+
					"5-VER TODOS LOS ACTORES \n"+
					"6-VER PELICULAS DE LOS ACTORES\n"+
					"7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"+
					"8-SALIR\n"
		);

		String opcionMenu = inputMenu.nextLine();


		switch(opcionMenu){
			case"1":
				System.out.println("Opcion uno nuevo actor");
				break;

			case"2":
				System.out.println("Opcion dos buscarr actor");
				break;

			case"3":
				System.out.println("Opcion tres eliminar actor");
				break;

			case"4":
				System.out.println("Opcion cuatro modificar actor");
				break;

			case"5":
				System.out.println("Opcion cinco ver todos los actor");
				break;

			case"6":
				System.out.println("Opcion seis ver peliculas de los actor");
				break;

			case"7":
				System.out.println("Opcion siete ver categoria d elas peliculas de los actor");
				break;

			case"8":
				System.out.println("Saliste del menu gracias por haber partisipado");
				break;

			default:
				System.out.println("Opcion Incorrecta");
				break;
		}
	}
}
