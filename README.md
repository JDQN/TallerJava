<h1>🚀Taller Java </h1>

-------------------------

☕ Taller evaluación Java  esta compuesto por 18 ejercicios para fortalecer los conceptos en JAVA 👨‍💻

<h3>Objetivo</h3>
<p>Practicar los conceptos básicos aprendidos y estudiados en el módulo de Desarrollo de Software en Java.</p>


<h3>Ejercicios Propuestos</h3>

<p>1.Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.</p>

<p>2. Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.</p>

<p>3. Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.</p>

<p>4. Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.</p>

<p>5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.</p>

<p>6. Realiza el ejercicio anterior usando un ciclo for.</p>

<p>7. Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.</p>

<p>8. Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.</p>

<p>9. Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.</p>

<p>10. Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.</p>

<p>11. Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.</p>

<p>12. Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.</p>

<p>13. Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)</p>

<p>14. Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.</p>

<p>15. Hacer un programa que muestre el siguiente menú de opciones
****** GESTION CINEMATOGRÁFICA ********
1-NUEVO ACTOR, 2-BUSCAR ACTOR, 3-ELIMINAR ACTOR, 4-MODIFICAR ACTOR
5-VER TODOS LOS ACTORES, 6-VER PELICULAS DE LOS ACTORES,
7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES, 8-SALIR
EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.</p>


<h2>☢ Nivel 2 ☣</h2>
<p>16. Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.


Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo será hombre por defecto, usa una constante para ello.


Se implantarán varios constructores:

Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:


calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.

esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
Métodos set de cada parámetro, excepto de DNI.

Ahora, crea una clase ejecutable que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por último, mostrar la información de cada objeto.</p>
