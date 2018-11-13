package zadania;

import java.util.Scanner;

public class Zad34 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj liczbe calkowita: ");
		int n = s.nextInt();
		int licznik = 0;
		if(n==2)
			licznik=2;
		else if(n>2){
			int a=1, b=1, c=a+b;
			licznik+=2;
			
		do{
			++licznik;
			a=b;
			b=c;
			c=a+b;
		}while(c<n);
		}
		System.out.println(licznik);
	}

}
