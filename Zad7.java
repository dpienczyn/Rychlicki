package zadania;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {

		System.out.println("Wprowadz dodatnia liczbe calkowita: ");
		Scanner s = new Scanner(System.in);
		int liczba = s.nextInt();
		StringBuilder i = new StringBuilder();
		i.append(liczba).reverse();
		StringBuilder wynik = new StringBuilder();
		wynik.append(liczba).append("-").append(i).append("=");
		wynik.append(liczba-Integer.parseInt(i.toString()));
		System.out.println(i);
		System.out.println(wynik);

	}

}
