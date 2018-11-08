/*Napisz aplikacj (plik 	ródowy: Dzielenie2.java) demonstrujc dzielenie z reszt dla liczb cakowitych o rónych znakach. Wyniki wywietlaj w postaci znanej z lekcji matematyki, np. 13 : 2 = 6 r. 1.
*/
package zadania;

public class Int {

	public static void main(String[] args) {
		int a = 21;
		int b = 2;
		
		System.out.println("a="+a+" b="+b+" a/b="+a/b+" reszta:"+a%b);
		
		int c = -15;
		int d =2;
		System.out.println("c="+c+" d="+d+" c/d="+c/d+" reszta:"+c%d);
		//Aplikacj uruchamiamy z dwoma parametrami, np. java Int(klasa-nazwa) 231 -347
		// Jeli podczas uruchomienia nie podamy dwóch argumentów lub argumenty nie bd poprawnie za-
		//pisanymi liczbami, to aplikacja przerwie prac i pojawi si odpowiedni komunikat.
		int suma = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		System.out.println(suma);

	}

}
