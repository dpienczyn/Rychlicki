package zadania;
import java.lang.Math;
public class Math4 {

	public static void main(String[] args) {
	        int[] dane = {2, 3, 4, 5, 6, 7, 8, 9, 10};
	        for(int n : dane) {
	            double x = Math.pow(5, 1.0/n);
	            System.out.printf("Pierwiastek %2d stopnia z 5: %f\n", n, x);
	        }
	    }
	}