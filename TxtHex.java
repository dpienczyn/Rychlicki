/*Napisz program (plik 	ródowy: Txt2Hex.java) zamieniajcy acuch znaków ASCII na acuch cyfr szesnastkowych odpowiadajcych tym znakom.
Zamie tekst na cig bajtów, a nastpnie przedstaw bajty w postaci szesnastkowej. Na jeden bajt (znak ASCII) przypadn dwie cyfry szesnastkowe.
*/
package zadania;

public class TxtHex {

	public static void main(String[] args) {
		
        String hex = "737A796672";
        System.out.print(hex+" -> ");
        byte[] tmp = new byte[hex.length()/2];
        for(int i = 0; i < tmp.length; ++i)
            tmp[i] = Byte.parseByte(hex.substring(2*i,2*i+2), 16);
        System.out.println(new String(tmp));
    }
}