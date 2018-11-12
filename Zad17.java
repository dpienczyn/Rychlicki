package zadania;

import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe a ,b, c ");
		System.out.println("Liczba a:");
		double a = s.nextDouble();
		System.out.println("Liczba b: ");
		double b = s.nextDouble();
		System.out.println("Liczba c: ");
		double c = s.nextDouble();
		s.close();

		if(a>b){
			System.out.println(" a jest wieksze od b");
		} if(a>c){
			System.out.println(" a jest wieksze od c");
		} if(b>a){
			System.out.println("b jest wieksze od a");
		} if(b>c){
			System.out.println("b jest wieksze od c");
		}if(c>a){
			System.out.println("c jest wieksze niz a");
		} if(c>b){
			System.out.println("c jest wieksze niz b");
		}
		System.out.println("Liczby uporzadkowane w kolejnosci niemalajcej: ");
		if(a<=b)
			if(a<=c)
				if(b<=c)
		System.out.printf("Liczby wprowadzone %f %f %f",a,b,c );
		
				else
					System.out.printf("%f %f %f", a,c,b);
			else
				System.out.printf(" %f %f %f ", c, a, b);
		else
		if(b<=c)
			if(a<=c)
				System.out.printf("%f %f %f", b, a, c);
			else
				System.out.printf("%f %f %f", b, c, a);
		else
			System.out.printf("%f %f %f", c, b, a);
	}

}
