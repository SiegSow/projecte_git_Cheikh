package prg03;

import java.util.Scanner;

public class Conversio {

	public static void main(String[] args) {

		// Iniciamos el scanner
		Scanner sc = new Scanner(System.in);

		// Declaracion de variables
		double euro=1;	// Creamos una variable de tipo double para almacenar los euros
		double dolar=1.18;	// Creamos una variable de tipo double para almacenar el valor del dolar
		double libra=0.9;	// Creamos una variable de tipo double para almacenar el valor de la libra

		double euroAdolar; // Creamos una variable de tipo double para almacenar la conversion de euro a dolar
		double euroAlibra; // Creamos una variable de tipo double para almacenar la conversion de euro a libra

		String a = "A";		// Creamos un string para su futura conversion a char
		String b = "B";		// Creamos un string para su futura conversion a char

		char eAd=a.charAt(0);	// Convertimos nuestro string 'a' a char
		char eAl=b.charAt(0);	// Convertimos nuestro string 'b' a char

		String opcion="";		// Creamos un string en blanco para introducir un valor posteriormente
		String eleccion = "";	// Creamos un string para almacenar la eleccion del usuario

		// Ejecucción del programa
		System.out.println("Introduce a que moneda quieres calcular la conversión \"A\" para dolares y \"B\" para libras");

		eleccion = sc.nextLine();				// Almacenamos la opcion elegida por el usuario

		char tipoMoneda = eleccion.charAt(0);	// Convertimos nuestro string opcion a char


		System.out.println("Ahora introduce la cantidad que desees intercambiar: ");

		euro = sc.nextDouble();		// Almacenamos la cantidad de euros que quiere convertir el usuario

		euroAdolar = euro * dolar;	// Formula para pasar de euros a dolares
		euroAlibra = euro * libra;	// Formula para pasar de euroas a libras

		opcion = (tipoMoneda == eAd) ? euro + "€"+ " son "+ euroAdolar+"$" : (tipoMoneda == eAl) ? euro + "€"+" son "+euroAlibra+" libras" :"Introduce un valor correcto para obtener tu conversion";
		// Creamos un ternario donde le decimos que si eleccion es 'A' convuierta de euro a dolar
		// Si eleccion es 'B' convierte de euro a libra
		// Si no es 'A' ni 'B' salta mensaje de error

		System.out.println(opcion);
	}

}
