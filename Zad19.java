package zadania;

import java.util.Scanner;

public class Zad19 {

	private static final String [] str1 = {"zero", "jeden", "dwa", "trzy", "cztery", "piec", "szesc",
			"siedem", "osiem", "dziewiec","dziesiec", "jedenascie", "dwanascie", "trzynascie", "czternascie", "pietnascie",
			"szesnascie", "siedemnascie", "osiemnascie", "dziewietnascie"
	};
	private static final String [] str2 = {"","","dwadziescia", "trzydziesci", "czterdziesci", "piecdziesiat",
			"szescdziesiat", "siedemdziesiat", "osiemdziesiat", "dziewiecdziesiat"
	};
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Wprowadz liczbe: ");
			int n = s.nextInt();
			
			StringBuilder wynik = new StringBuilder();
	        if (n >= 100 || n < 0) { 
	        	/* Bdne dane */
	        	            System.out.println("Bdna warto liczby!");
	        	        } else if (n >= 20) { 
	        	/* Liczba wiksza lub równa 20 */
	        	            wynik.append(str2[n/10]);
	        	            int d = n%10; 
	        	/* Cyfra jednoci */
	        	            if (d > 0)
	        	                wynik.append(" ").append(str1[d]);
	        	        } else if(n >= 10) 
	        	/* 10, 11, 12, ..., 19 */
	        	            wynik.append(str1[n]);
	        	        else 
	        	/* Liczby jednocyfrowe */
	        	            wynik.append(str1[n]);
	        	        wynik.append(".");
	        	        System.out.println(wynik);
	        	    }
	        	}