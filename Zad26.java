package zadania;

import java.util.Scanner;

public class Zad26 {

	private static final String[] dzien = {"niedziela", "poniedzialek", "wtorek", "sroda",
		    "czwartek", "piatek", "sobota"};
	
	public static void main(String[] args) {
		System.out.println("Zmiana formatu daty");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj date w formacie dd.mm.rrrr: ");
        String str = input.nextLine();
        int d = Integer.parseInt(str.substring(0, 2));
        int m = Integer.parseInt(str.substring(3, 5));
        int y = Integer.parseInt(str.substring(6, 10));
        int z, c;
        if(m<3)
        	z = y-1;
        else
        	z=y;
        if(m<3)
        	c = 0;
        else
        	c = 2;
        int dt = (23*m/9+d+4+y+z/4-z/100+z/400-c)%7;
        StringBuilder r = new StringBuilder(str);
        r.append(" - ").append(dzien[dt]);
        System.out.println(r);
        
	}

}
