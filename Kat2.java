package zadania;
import java.lang.Math;

public class Kat2 {

	public static void main(String[] args) {
		double a, b , c;
		a=3.0; 
		b=4.0;
		c=5.0;
		int sek, min, stp;
		double alfa = Math.asin(a/c);
		double beta = Math.acos(a/c);
		System.out.printf("Miara konta alfa i beta w radianach: %.4f, %.4f ", alfa, beta);
		Math.toDegrees(alfa);
		System.out.printf("\nMiara konta alfa i beta w stopniach: %.1f, %.1f ", alfa, beta);
		System.out.println();
		stp = (int)alfa;
		min = ((int)((alfa-stp)*60+0.5));
		System.out.printf("Kat Alfa stopnie i minuty: %d %d ", stp,min );
		stp = (int)beta;
		min = ((int)((beta-stp)*60+0.5));
		System.out.printf("\nKat Beta stopnie i minuty: %d %d ", stp,min );
		min = ((int)((alfa-stp)*60));
		sek = (int)((alfa-stp-min/60.0)*3600+0.5);
		System.out.printf("\nKat Alfa stopnie ,minuty i sekundy: %d %d %d ", stp,min, sek );
		min = ((int)((beta-stp)*60));
		sek = (int)((beta-stp-min/60.0)*3600+0.5);
		System.out.printf("\nKat Beta stopnie ,minuty i sekundy: %d %d %d ", stp,min, sek );
	}

}
