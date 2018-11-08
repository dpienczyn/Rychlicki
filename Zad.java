package zadania;

import java.util.Scanner;

public class Zad {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz pierwsza liczbe binarna: ");
		String b = s.nextLine();
		System.out.println("Wprowadz druga liczbe binarna: ");
		String c = s.nextLine();
		int liczba = Integer.parseInt(b, 2);
		int liczba1 = Integer.parseInt(c, 2);
		int suma = liczba + liczba1;
		String w = Integer.toBinaryString(suma);
		System.out.println("Syma liczb binarnych wynosi: "+w);
		

	}

}
