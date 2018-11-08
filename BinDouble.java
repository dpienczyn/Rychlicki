package zadania;

public class BinDouble {

	public static void main(String[] args) {
		String bin = "111110000011110000111000110010";
		System.out.println(bin);
		int n = Integer.parseInt(bin, 2);
		float x = Float.intBitsToFloat(n);
		System.out.println(n);
		System.out.println(x);
		
	}

}
