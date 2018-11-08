package zadania;

import java.util.Scanner;

public class Trojkat1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Podaj dlugosc przyprostokatnej a: ");
		double a = s.nextDouble();
		System.out.println("Podaj miare kata ostrego: ");
		double b = s.nextDouble();
		b = Math.toRadians(b);
		double kat = Math.sin(b);
		double c = a/kat;
		System.out.printf("D³ugoœæ przeciwprostokatnej wynosi: %.3f", c);
		
	}

}
