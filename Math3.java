package zadania;
import java.lang.Math;

public class Math3 {

	public static void main(String[] args) {
		
		int [] liczba = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int l: liczba){
			double x = Math.pow(5, 1.0);
			System.out.printf("Pierwiastek %2d stopnia ",l, "z 5 %.6f ", x);
		}
	}

}
