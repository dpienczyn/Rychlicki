/*Napisz program (plik 	r�dowy: Kodowanie.java) zamieniajcy acuch znak�w (np. sowo kodowanie) na cig bajt�w odpowiadajcych tym znakom.
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
