package zadania;
import java.lang.Math;

public class Kat {

	public static void main(String[] args) {
		double a = Math.toDegrees(1);
		int st, s, m;
		st = (int)a;
		m = ((int)((a-st)*60+0.5));
		System.out.println(a+'\u00B0');
		System.out.println(st);
		System.out.println(m);
		m = ((int)((a-st)*60));
		int sek;
        sek = (int)((a-st-m/60.0)*3600+0.5);
        System.out.printf("1 rad = %d\u00B0%02d\'%02d\"\n", st, m, sek);

	}

}
