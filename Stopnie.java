package zadania;
import java.lang.Math;
import java.util.Scanner;

public class Stopnie {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz jakas liczbe: ");
		double liczba = s.nextDouble();
		
		double f = liczba*1.8+32;
		
		System.out.printf("Wartoœæ wynosi: %.1f", f);

	}

}
