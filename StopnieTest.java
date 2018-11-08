package zadania;

import java.util.Scanner;

public class StopnieTest {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Podaj uamek zwyky (np. 23/45): ");
            String u = input.next();
            int a = Integer.parseInt(u.substring(0, u.indexOf("/")));
            int b = Integer.parseInt(u.substring(u.indexOf("/")+1));
            System.out.printf("%d/%d = %.1f%%%n", a, b, 100.0*a/b);
            input.close();
        }
    }
