package zadania;

import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe: ");
		int liczba = s.nextInt();
		String [] str = {"zero", "jeden", "dwa", "trzy", "cztery", "piec", "szesc",
				"siedem", "osiem", "dziewiec"
		};
		StringBuilder r = new StringBuilder("S³ownie.. :");
		if(liczba>0&&liczba<10){
			System.out.println(str[liczba]);
		} else
			System.out.println("B³êdna wartoœæ liczby... ");

	}

}
