package zadania;

import java.util.Scanner;

public class Zad13 {

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
		double q = -(Math.sqrt(b)-4*a*c)/4*a;
		StringBuilder r = new StringBuilder();
		
		if(a>0){
			r.append("<").append(q).append(" ,").append("+oo").append(")");
		}
		if(a<0){
			r.append("(").append("-oo").append(" ,").append(q).append(">");
		}
		System.out.println(r);
	}

}
