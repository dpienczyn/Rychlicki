package zadania;

import java.util.Scanner;

public class Stopnie1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe: ");
		int liczba = s.nextInt();
		
		
		double c = (liczba-32)/1.8;
		
		System.out.printf("Wartoœæ wynosi: %.1f ", c);

	}

}
