package zadania;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {

		System.out.print("Podaj wspórzdne wektora(w postaci [a, b, c]): ");
		Scanner s = new Scanner(System.in);
		String w = s.nextLine().trim();
		s.close();
		StringBuilder r = new StringBuilder(w);
		r.deleteCharAt(0).deleteCharAt(r.length()-1);
		int poz = r.indexOf(",");
		int poz1 = r.lastIndexOf(",");
		double a = Double.parseDouble(r.substring(0, poz));
		double b = Double.parseDouble(r.substring(poz+1, poz1));
		double c = Double.parseDouble(r.substring(poz1+1));
		double suma = Math.sqrt(a+b+c);
		System.out.println(suma);

	}

}
