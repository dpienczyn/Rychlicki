package zadania;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("WprowadŸ swoje imie: ");
		String imie = s.nextLine();
		System.out.println("Wprowadz swoje nazwisko: ");
		String nazwisko = s.nextLine();
		System.out.println("Wrowadz liczbe przepracowanych godzin w tym miesiacu: ");
		int liczba = s.nextInt();
		System.out.println("Wprowadz stawke godzinowa która Tobie przysluguje: ");
		double stawka = s.nextDouble();
		double suma = liczba * stawka;
		System.out.printf("Twoja pensja na ten miesiac wynosi: %.2f", suma);

	}

}
