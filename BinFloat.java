package zadania;

public class BinFloat {

	public static void main(String[] args) {
		String bin = "111110000011110000111000110010";
		System.out.println("Bin: "+bin);
		long n = Long.parseLong(bin, 2);
		System.out.println("Long: "+n);
		double x = Double.longBitsToDouble(n);
		System.out.println("Double: "+x);
		
	}

}
