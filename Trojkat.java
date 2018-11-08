package zadania;
import java.lang.Math;

import java.util.Scanner;

public class Trojkat {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj dlugosc boku a: ");
		double a= s.nextDouble();
		System.out.println("Podaj dlugosc boku b: ");
		double b = s.nextDouble();
		double c = Math.sqrt(a*a+b*b);
		System.out.printf("D³ugoœæ przeciwprostok¹tnej w trójk¹cie wynosi: %.3f", c);
		s.close();

	}

}
