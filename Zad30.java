package zadania;

import java.util.Scanner;

public class Zad30 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz promien kola: ");
		double r;
		double pole;
		do{
			r = s.nextDouble();
			if(r<=0){
				System.out.println("Podaj jeszcze raz dlugosc promienia: ");
			}else{
			
			pole = Math.PI*r*r;
			System.out.printf("Pole kola wynosi: %.2f ",pole);
			}
		}while(r<=0);

	}

}
