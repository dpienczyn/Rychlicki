package zadania;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/dominika/workspace/QuizPytania/bin/zadania/dane.txt");
		Scanner i = new Scanner(f);
		String imie = i.next();
		String nazwisko = i.next();
		int liczba = i.nextInt();
		double o = i.nextDouble();
		double suma = liczba * o;
		System.out.printf("Dane pracownika:\n Imie: %s\n Nazwisko: %s\n Pensja tego pracownika wynosi: %.2f\n", imie, nazwisko, suma);
		i.close();
	}

}
