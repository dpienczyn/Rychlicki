package zadania;

import java.util.Scanner;

public class Zad28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		double liczba;
		do{
			System.out.println("Podaj liczbe dodatnia: ");
			liczba = s.nextDouble();
		}while(liczba<=0);
		s.close();
		System.out.println("Wprowadzona liczba jest dodatnia: "+liczba);
	}

}
