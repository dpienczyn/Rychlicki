package zadania;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {

		System.out.println("Podaj swoje imie: ");
		Scanner s = new Scanner(System.in);
		String imie = s.nextLine();
		s.close();
		StringBuilder r = new StringBuilder(imie);
		char z = r.charAt(imie.length()-1);
		if(z=='a'){
			System.out.println("Jest kobieta");
		}else{
			System.out.println("Jest mezczyzna");
		}

	}

}
