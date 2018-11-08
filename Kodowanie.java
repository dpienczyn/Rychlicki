/*Napisz program (plik 	ródowy: Kodowanie.java) zamieniajcy acuch znaków (np. sowo kodowanie) na cig bajtów odpowiadajcych tym znakom.
*/
package zadania;

public class Kodowanie {

	public static void main(String[] args) {
		String napis = "Kodowanie";
		
		byte[] kod = napis.getBytes();
		for(byte n : kod){
			System.out.println(n);
		}

	}

}
