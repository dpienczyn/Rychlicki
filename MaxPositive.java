/*Napisz program (plik 	r�dowy: MaxPositive.java) wywietlajcy maksymalne wartoci liczb cakowitych typu byte, short, int i long. Wyniki wywietl w postaci binarnej i szesnastkowej.
*/
package zadania;

public class MaxPositive {

	public static void main(String[] args) {
		long l = Long.MAX_VALUE;
		System.out.println("Posta� binarna typu LONG: "+Long.toBinaryString(l));
		System.out.println("Posta� szesnastkowa typu LONG: "+Long.toHexString(l));
		
		int i = Integer.MAX_VALUE;
		System.out.println("Posta� binarna typu Integer: "+Integer.toBinaryString(i));
		System.out.println("Posta� szesnastkowa typu Integer: "+Integer.toHexString(i));
		
		System.out.println("Posta� binarna typu Short: "+Integer.toBinaryString(Short.MAX_VALUE));
		System.out.println("Posta� szesnastkowa typu Short: "+Integer.toHexString(Short.MAX_VALUE));

		System.out.println("Posta� binarna typu Byte: "+Integer.toBinaryString(Byte.MAX_VALUE));
		System.out.println("Posta� szesnastkowa typu Byte: "+Integer.toHexString(Byte.MAX_VALUE));
		
		
	}

}
