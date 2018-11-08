package zadania;

public class StaticInteger {

    public static void main(String args[]) {
        System.out.println("Wybrane stale i metody statyczne klasy Integer\n");
        System.out.println("Wartosc minimalna typu int: "+ Integer.MIN_VALUE);
        System.out.println("Wartosc maksymalna typu int: "+ Integer.MAX_VALUE);
        System.out.println("Rozmiar (w bitach) typu int: "+ Integer.SIZE);
        int a = 179;
        System.out.println("Liczba calkowita a = "+a+" - zapis (ciag cyfr):");
        System.out.println("w systemie binarnym: "+ Integer.toBinaryString(a));
        System.out.println("w systemie �semkowym: "+ Integer.toOctalString(a));
        System.out.println("w systemie szesnastkowym: "+ Integer.toHexString(a));
        System.out.println("w systemie dziesiatkowym: "+ Integer.toString(a));
        System.out.println("w systemie czw�rkowym: "+ Integer.toString(a, 4));
        int b = Integer.parseInt("-177");
        System.out.println("b = "+b);
        int c = Integer.parseInt("-177", 8);
        System.out.println("c = "+c);
        System.out.println("Metoda signum():");
        System.out.println("Znak liczby a: "+Integer.signum(a));
        System.out.println("Znak liczby b: "+Integer.signum(b));
        System.out.println("Znak liczby 0: "+Integer.signum(0));
    }
}
