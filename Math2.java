/*Napisz aplikacj, która wywietli w konsoli w trzech kolumnach liczby naturalne 2, 3,
5, 7, 11, 13 i 17, pierwiastki kwadratowe i pierwiastki szecienne z tych liczb. Warto-
ci pierwiastków wywietlaj z do
kadnoci do 8 miejsc po przecinku, w kolumnach
o szerokoci 15 znaków.*/
package zadania;
import java.lang.Math;
public class Math2 {

	public static void main(String[] args) {
		int [] liczby = {2, 3, 5, 7, 11, 13 ,17};
		
		System.out.print("Pierwiastki kwadratowe  Pierwiastki szeœcienne \n ");
		for(int l: liczby){
		System.out.printf(" %15.8f ", Math.sqrt(l));
		System.out.printf(" %15.8f ", Math.cbrt(l));
		System.out.println();
		}

	}

}
