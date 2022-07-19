package org.example.Dos;

import java.util.Scanner;

public class EjercicioDos {
	public static void main(String[] args) {

		/*
		* Al ejercicio anterior agregar entrada por consola de dos valores
		* e indicar si son mayores, menores o iguales.
		*/
		Integer numeroUno = 16;
		Integer numeroDos= 12;

		if(numeroUno < numeroDos){
			System.out.println(numeroUno+ " es menor que " +numeroDos);
		}else{
			System.out.println("Numero Uno no es menor a numero Dos");
		}


		if(numeroUno > numeroDos){
			System.out.println(numeroUno+ " es mayor que " +numeroDos);
		}else{
			System.out.println("No se cumple");
		}


		if(numeroUno == numeroDos){
			System.out.println(numeroUno+ " es igual a " +numeroDos);
		}else{
			System.out.println("numero Uno es igual a numero Dos");
		}


		if(numeroUno != numeroDos){
			System.out.println(numeroUno+ " es diferente a " +numeroDos);
		}
		else{
			System.out.println("No se cumple");
		}
	}
}
