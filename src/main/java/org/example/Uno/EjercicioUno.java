package org.example.Uno;

public class EjercicioUno {

	public static void main(String[] args) {

		/*
		* 1. Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor
		* de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar
		* que funciona.
		*/
		Integer numeroUno = 3;
		Integer numeroDos = 6;

		boolean result1 = numeroUno < numeroDos;
		Integer result2 = numeroDos + numeroUno;
		Integer result3 = numeroDos - numeroDos;
		Integer result4 = numeroDos * numeroDos;

		System.out.println(numeroUno+ " < " +numeroDos+ " True "+
					"\n" +numeroUno+ " > " +numeroDos+ " False "+
					"\n" +numeroUno+ " + " + numeroDos + " =  " +result2+
					"\n" +numeroUno+ " - " + numeroDos + " = " +result3+
					"\n" +numeroUno+ " * " + numeroDos + " = " +result4
		);

	}
}
