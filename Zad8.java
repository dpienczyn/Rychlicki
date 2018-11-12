package zadania;

import java.util.Scanner;

public class Zad8 {

    public static void main(String args[]) {
        System.out.print("Podaj wspórzdne wektora(w postaci [a, b]): ");
        Scanner input = new Scanner(System.in);
        String wekt = input.nextLine().trim();
        input.close();
        StringBuilder tmp = new StringBuilder(wekt);
        /* Usuwamy pierwszy i ostatni znak, czyli nawiasy prostoktne. */
        tmp.deleteCharAt(0).deleteCharAt(tmp.length()-1);
        /* Znajdujemy pozycj przecinka midzy liczbami. */
        int poz = tmp.indexOf(",");
        /* Odczytujemy wartoci liczb. */
        double a = Double.parseDouble(tmp.substring(0, poz));
        double b = Double.parseDouble(tmp.substring(poz+1));
/* Obliczamy i wywietlamy dugo  wektora. */
        System.out.println("Dugo wektora "+wekt+" jest równa "+
            Math.sqrt(a*a+b*b));
    }
}
