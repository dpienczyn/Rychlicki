package zadania;

public class DoubleBin {

    static String zero =
    	      "0000000000000000000000000000000000000000000000000000000000000000";
	public static void main(String[] args) {
		double [] a={0.25, 0.5, 1.0, 2.0, 512.0};
		for(double t:a){
            System.out.println("x = "+t);
            String tmp = Long.toBinaryString(Double.doubleToLongBits(t));
            String bin = zero.substring(0, 64-tmp.length())+tmp;
            System.out.println("BIN: "+bin);
            System.out.println("Bit znaku: "+bin.charAt(0));
            System.out.println("Cecha:     "+bin.substring(1, 12));
            System.out.println("Mantysa:   "+bin.substring(12));
		}

	}

}
