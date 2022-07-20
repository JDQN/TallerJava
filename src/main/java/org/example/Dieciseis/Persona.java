package org.example.Dieciseis;

public class Persona {

	/******ATRIBUTOS******/
	private String name;
	private Integer age;
	private String DNI;
	private char genero;
	private double peso;
	private double altura;


	/******CONSTANTES******/
	/*Genero por default*/
	private static final char genero_default = 'H';
	/*Desnutricion*/
	static final Integer desnutricion = -1;
	/*Peso ideal*/
	static final Integer pesoIdeal = 0;
	/*Sobre peso*/
	static final Integer sobrepeso = 1;


	/******CONSTRUCTORES******/

	/**
	 * Constructor por default
	 */
	public Persona() {
		this("", 0, genero_default, 0, 0);
	}

	/**
	 * Constructor con 3 parametros
	 *
	 * @param name   de la persona
	 * @param age    de la persona
	 * @param genero de la perosna
	 */
	public Persona(String name, Integer age, char genero) {
		this.name = name;
		this.age = age;
		this.genero = genero;
	}


	/**
	 * Constructor con 5 parametros
	 *
	 * @param name
	 * @param age
	 * @param genero
	 * @param peso
	 * @param altura
	 */
	public Persona(String name, Integer age, char genero, double peso, double altura) {
		this.name = name;
		this.age = age;
		this.peso = peso;
		this.altura = altura;
		this.genero = genero;
		this.comprobar_genero();
		generarDNI();
	}

	/**
	 * Metodo Privado comprobar_genero
	 */
	private void comprobar_genero() {
		/*Si el genero no es M por defecto el tomara H*/
		if (genero != 'H' && genero != 'M') {
			this.genero = genero_default;
		}
	}


	/**
	 * Metodo privado generarDNI
	 */
	private void generarDNI() {
		final Integer divisor = 23;

		/*Generamos un numero d e8 digitos*/
		int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
		int res = numDNI - (numDNI / divisor * divisor);

		/*Calculamos la letra del DNI*/
		char letraDNI = generarLetraDNI(res);

		/*Pasamos el DNI a String*/
		DNI = Integer.toString(numDNI) + letraDNI;
	}

	private char generarLetraDNI(int res) {
		char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
					'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
					'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return letras[res];
	}


	/**
	 * Este metodo modifica el nombre de la persona
	 * Metodo Publico setName
	 * @param name a canbiar
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Este metodo modifica la edad de la persona
	 * Metodo publico  setAge
	 * @param age a cambiar
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Modifica el genero de la persona y comprueba que es correcto
	 * @param genero a cambiar
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}


	/**
	 * El metodo setPeso modifica el peso de la persona
	 * @param peso canbia el peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}


	/**
	 * El metodo setAltura modifica la altura de la Persona
	 *
	 * @param altura
	 * @param v
	 */
	public void setAltura(double v) {
		this.altura = altura;
	}


	/**
	 * Calculamos el indice d ela masa coorporal de la persona
	 */
	public int calcularIMC() {
		//Calculamos el peso de la persona
		double pesoActual = peso / (Math.pow(altura, 2));
		//Segun el peso, devuelve un codigo
		if (pesoActual >= 20 && pesoActual <= 25) {
			return pesoIdeal;
		} else if (pesoActual < 20) {
			return desnutricion;
		} else {
			return sobrepeso;
		}
	}


	/**
	 * Indica si la persona es mayor de edad
	 * @return true si es mayor de edad y false es menor de edad
	 */
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (age >= 18) {
			mayor = true;
		}
		return mayor;
	}

	/**
	 * Devuelve informacion del objeto
	 * @return cadena con toda la informacion
	 */
	@Override
	public String toString() {
		String genero;
		if (this.genero == 'H') {
			genero = "Hombre";
		} else {
			genero = "Mujer";
		}
		return "Informacion de la persona:\n"
					+ "Nombre: " + name + "\n"
					+ "Genero: " + genero + "\n"
					+ "Edad: " + age + " años\n"
					+ "DNI: " + DNI + "\n"
					+ "Peso: " + peso + " kg\n"
					+ "Altura: " + altura + " metros\n";
		}

}
