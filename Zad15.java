package zadania;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj trzy wspolczynniki a, b, c: ");
		System.out.println("Podaj a: ");
		double a = s.nextDouble();
		if(a==0){
			System.err.println("Wspolczynnik a nie mo¿e byæ równy zero");
			System.exit(0);
		}
		System.out.println("Podaj b: ");
		double b = s.nextDouble();
		System.out.println("Podaj c: ");
		double c = s.nextDouble();
		s.close();
		double p = -b/(2*a);
		double q= -(Math.sqrt(b)-4*a*c)/4*a;
		
		StringBuilder r = new StringBuilder();
		r.append("Funkcja jest #1 w przedziale (-oo, ").append(p);
		r.append("> i #2 w przedziale <").append(p).append(", +oo).");
		int p1 = r.indexOf("#1");
		int p2 = r.indexOf("#2");
		if(a>0){
			r.replace(p2, p2+2, "rosn¹ca").replace(p1, p1+2, "malej¹ca");
		}else
		    r.replace(p2, p2+2, "malejaca").replace(p1, p1+2, "rosnaca");
		System.out.println(r);

		r.delete(0, r.length());
		r.append("Funkcja osiaga wartosc ");
		if (a > 0)
		    r.append("minimalna");
		else
		    r.append("maksymalna");
		r.append(" y = ").append(q).append(" w punkcie x = ").append(p).append(".");
		System.out.println(r);
	}

}
