package zadania;

import java.util.Scanner;

public class Zad32 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz dwie dane R i r: ");
		System.out.println("Gdzie du¿e R - promien zewnetrzny, r - promien wewnetrzny ");
		double R, r;
		double P;
		
		do{
			System.out.println("Podaj R: ");
			R = s.nextDouble();
			System.out.println("Podaj r: ");
			r = s.nextDouble();
			if(r<=0||r>=R||R<=0){
			if(r<=0)
				System.out.println("r musi byc wiêksze od zera");
				if(r>=R)
					System.out.println("R musi byc wiêksze niz r");
					if(R<=0)
						System.out.println("R musi byc wiêksze od zera");
				//System.out.println("Podaj prawid³owe dane, r musi byc wikesze od zera a R musi byc wieksze od r");
			}
					else{
				P = Math.PI*R*R-Math.PI*r*r;
				System.out.printf("Pierscien kolowy wynosi: %.2f",P);
				System.exit(0);
			}
		}while(true);

	}

}
