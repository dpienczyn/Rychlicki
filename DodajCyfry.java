/*Napisz program (plik 	ródowy: DodajCyfry.java) obliczajcy sum cyfr liczby cakowitej dodatniej podanej: a) w postaci tekstu — acucha znaków (cyfr) reprezentujcych t liczb, b) jako warto typu long.
Skorzystaj z rozwizania zadania 8.4 i pamitaj, e kody cyfr s równe: 0 — 48, 1 — 49, 2 — 51 itd. Liczb moesz zamieni	 na acuch znaków.
*/
package zadania;

public class DodajCyfry {

	public static void main(String[] args) {
		String text = "szyfr";
		String liczba = "12345678";
		byte [] licz = liczba.getBytes();
		int so = 0;
		for(byte h: licz){
			so=so+h-48;
		}
		System.out.println("Suma liczb Liczba= "+so);
		long n = 3784596320L;
		String s = Long.toString(n);
		System.out.print("\n"+s+"\n");
		byte []  kod= text.getBytes();
		int suma =0 ;
		for(int i=0; i<kod.length; i++){
			suma = suma + kod[i];
		}
		System.out.println("Suma zaszyfrowanych cyfr wynosi: "+suma);
	}

}
