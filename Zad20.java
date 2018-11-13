package zadania;

import java.util.Scanner;

public class Zad20 {

	private static final String [] str1 = { "zero","jeden", "dwa", "trzy", "cztery", "piec", "szesc",
			"siedem", "osiem", "dziewiec"
	};
	private static final String [] str2 ={"dziesiec", "jedenascie", "dwanascie", "trzynascie", "czternascie", "pietnascie",
			"szesnascie", "siedemnascie", "osiemnascie", "dziewietnascie"
			
	};
	private static final String [] str3 = {"","","dwadziescia", "trzydziesci", "czterdziesci", "piecdziesiat",
			"szescdziesiat", "siedemdziesiat", "osiemdziesiat", "dziewiecdziesiat"
	};
	private static final String [] str4 ={"","sto", "dwiescie", "trzysta", "czterysta",
			"piecset", "szescset", "siedemset", "osiemset", "dziewiecset"
			
	};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe: ");
		int n = s.nextInt();
		
		StringBuilder wynik = new StringBuilder();
		if(n>=1000||n<0){
			System.out.println("B³edna wartosc");
		} else if(n<10){
			System.out.println(str1[n]);
		}else if(n>=10&&n<20){
			n = n%10;
			System.out.println(str2[n]);
		}else if(n>=20&&n<100){
			wynik.append(str3[n/10]);
			n = n%10;
			wynik.append(" ").append(str1[n]);
			System.out.println(wynik);
		}else  if(n>=100&&n<1000){
			n = n/100;
			if(n!=0){
				n=n%100;
				wynik.append(str4[n]);
				n= n/10;
				wynik.append(str3[n]);
				n=n%10;
				wynik.append(str1[n]);
				}
			System.out.println(wynik);
		}
	}
	}
