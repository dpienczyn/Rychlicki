/*Napisz program (plik 	r�dowy: Dekodowanie.java) zamieniajcy cig bajt�w (np. {115, 122, 121, 102, 114}) na acuch znak�w odpowiadajcych tym liczbom.
*/
package zadania;

public class Dekodowanie {

	public static void main(String[] args) {
		byte [] kod = {115, 122, 121, 102, 114};
		
		String wynik = new String(kod);
		
		System.out.println(wynik);

	}

}
