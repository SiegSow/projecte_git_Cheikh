package prgUD03;

public class metropolis {

	public static void main(String[] args) {
		
		
		//Declaramos la variable booleana esCapital 
		
		boolean esCapital=false;
		//Declaramos variable de tipo entero int para el numero de ciudadanos
		
		int nombreDeCiutadans=1000000;
		//Declaramos variable immpuesto por ciudadano de tipo double al tener decimales
		
		double impostPerCiutada=250;
		//Declaramos variable rentaMedia en la que multiplicamos el nº de ciudadanos * su impuesto y *12 para sacar la renta media anual total
		
		double rentaMedia=(nombreDeCiutadans*impostPerCiutada)*12;
		//Declaro variable string con comillas sin contenido para escribir en el ternario si es o no es una metropolis.
		String resultado="";
		
		//Declaramos expresion booleana en la que le preguntamos las dos condiciones que pide el ejercicio, ponemos un "OR" para que si alguna de las dos expresiones es true
		//nos devuelva true
		boolean esMetropolis=(nombreDeCiutadans>200000)&& (rentaMedia>=720000000) || (esCapital==true) && (nombreDeCiutadans>100000);
		
		//Compruebo una condicion con un ternario
System.out.println(resultado=(nombreDeCiutadans>100000)&& esCapital==true?"Es una metropolis":"No es una metropolis") ;

	//Compruebo otra condicion con un ternario
System.out.println(resultado=(nombreDeCiutadans>200000)&& rentaMedia>=720000000?"Es una metropolis":"No es una metropolis");

//Compruebo si mi expresion booleana es correcta
System.out.println(esMetropolis);
	}

}
