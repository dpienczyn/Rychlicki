/*Napisz program (plik 	ródowy: MinMax.java) wywietlajcy minimalne i maksymalne wartoci liczb cakowitych typu byte, short, int i long. Wyniki wywietl w postaci: nazwa typu <warto minimalna, warto maksymalna>.
*/
package zadania;

public class MinMax {

	public static void main(String[] args) {

		byte b = Byte.MAX_VALUE;
		byte c = Byte.MIN_VALUE;
		
		System.out.println("byte < "+b+" "+c+" > ");
		
		short t = Short.MAX_VALUE;
		short y = Short.MIN_VALUE;
		
		System.out.println("short < "+t+" "+y+" > ");
		
		int r = Integer.MAX_VALUE;
		int e = Integer.MIN_VALUE;
		
		System.out.println("Integer < "+r+" "+e+" > ");
		
		long w = Long.MAX_VALUE;
		long h= Long.MIN_VALUE;
		
		System.out.println("Long < "+w+" "+h+" > ");
	}

}
