package zadania;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {

		System.out.println("Podaj wspórzdne wektora(w postaci [a, b]): ");
		Scanner s = new Scanner(System.in);
		String w1 = s.nextLine();
		s.close();
		StringBuilder b = new StringBuilder(w1);
		String b1[] = b.toString().split(",");
		double a = Double.parseDouble(b1[0]);
		double c = Double.parseDouble(b1[1]);
		double suma = Math.sqrt(a+c);
		System.out.println(suma);

	}

}
