package zadania;

import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz liczbe a i b: ");
		System.out.println("Liczba a: ");
		double a = s.nextDouble();
		System.out.println("Liczba b: ");
		double b = s.nextDouble();
		s.close();
		StringBuilder r = new StringBuilder();
		if(a<b){
			r.append("<").append(a).append(" ,").append(b).append(">");
		}
		if(a>b){
			r.append("<").append(b).append(" ,").append(a).append(">");
		}if(a==b){
			r.append("{").append(a).append("}");
		}
		System.out.println(r);
	}
}
