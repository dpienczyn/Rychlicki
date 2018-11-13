package zadania;

import java.util.Scanner;

public class Zad27 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadzaj liczby :");
		System.out.println("Podaj liczbe: ");
		double suma = 0;
		double liczba;
		do{
			liczba = s.nextDouble();
			suma = suma+liczba;
			System.out.println(suma);
		}while(liczba!=0);
		s.close();
		System.out.println("Suma liczb wynosi: "+suma);

	}

}
