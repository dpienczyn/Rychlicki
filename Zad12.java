package zadania;

import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		System.out.println("Wprowadz dlugosc boku: ");
		Scanner s = new Scanner(System.in);
		double liczba = s.nextDouble();
		s.close();
		if(liczba>0){
			double pole = liczba*liczba;
			double obwod = 4*liczba;
			System.out.println(pole);
			System.out.println(obwod);
		}if(liczba<=0){
			System.out.println("Niewlasciwe dane");
		}
		
		

	}

}
