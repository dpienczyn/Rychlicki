package zadania;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		System.out.println("Obliczanie wspolrzednych wierzcholka paraboli: ");
		System.out.println("Poadj wspolczynniki trojmianu kwadratowego ");
		Scanner i = new Scanner(System.in);
		double a, b, c;
		a = i.nextDouble();
		b= i.nextDouble();
		c = i.nextDouble();
		i.close();
		double delta = Math.sqrt(b)-4*a*c;
		StringBuilder s = new StringBuilder("(#1, #2)");
			int start= s.indexOf("#1");
			s.replace(start, start+1, String.valueOf(-b/(2*a)));
			start = s.indexOf("#2");
			s.replace(start, start+1, String.valueOf(-delta/(4*a)));
			System.out.println("Wierzcholek prabaoli: "+s);
	}
}