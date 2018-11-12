package zadania;

import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe a i b ");
		System.out.println("Liczba a:");
		double a = s.nextDouble();
		System.out.println("Liczba b: ");
		double b = s.nextDouble();
		s.close();
		System.out.println("Równanie liniowe ma postaæ: ax+b=0");
		if(a!=0){
			double q = (-b)/a;
			System.out.printf(" Równanie sprzeczne x= %.2f ", q);
		}else if(b!=0){
			System.out.print(" Rownanie 0x= 1 ");
		}else
			System.out.print("Rownanie tozsamosciowe 0x = 0");
		
		
	}

}
