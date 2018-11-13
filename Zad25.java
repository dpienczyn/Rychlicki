package zadania;

import java.util.Scanner;

public class Zad25 {

	private static final String[] mies = {"", "stycznia", "lutego", "marca",
		    "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "wrzenia",
		    "pa dziernika", "listopada", "grudnia"};
	private static final String[] rzym = {"","I", "II", "III", "IV", "V","VI", "VII", 
			"VIII", "IX", "X","XI", "XII"};
	
	public static void main(String[] args) {
		System.out.println("Zmiana formatu daty");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj date w formacie dd.mm.rrrr: ");
        String str = input.nextLine();
        int ms = Integer.parseInt(str.substring(3, 5));
        int rz = Integer.parseInt(str.substring(3, 5));
        StringBuilder r = new StringBuilder(str);
        r.replace(2, 3, " ").replace(5, 6, " ").replace(3, 5, mies[ms]);
        System.out.println(r);
        r.replace(2, 3, " ").replace(5, 6, " ").replace(3, 10, rzym[rz]);
        System.out.println(r);
        

	}

}
