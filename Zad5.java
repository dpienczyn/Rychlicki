package zadania;

import java.util.Scanner;

public class Zad5 {

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
		StringBuilder s = new StringBuilder("(, )");
			s.insert(3, -b/(2*a)).insert(1, -delta/(4*a));     //(-b/(2*a)))  //.append(", ").append(-delta/(4*a)).append(")");
			System.out.println("Wierzcholek prabaoli: "+s);
	}
}
