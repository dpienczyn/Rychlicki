package zadania;

import java.util.Scanner;

public class Zad23 {

	public static void main(String[] args) {

        System.out.println("Zmiana formatu daty");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj dat w formacie dd.mm.rrrr: ");
        String str = input.next();
        /* Zakadamy poprawno  formatu i wartoci wprowadzonej daty. */
        StringBuilder data = new StringBuilder(str);
        data.replace(2, 3, "-").replace(5, 6, "-");
        data.append(data.substring(0,2)).delete(0, 2);
        data.insert(0, data.substring(4, 8)).delete(8, 12);
        System.out.println(data);
     }
}