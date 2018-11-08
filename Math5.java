package zadania;

public class Math5 {

	public static void main(String[] args) {
        System.out.printf("Znak%10s%10s%10s\n", "OCT", "DEC", "HEX");
        char[] znaki = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(char z : znaki) {
            System.out.printf("%1$3c %2$10o%2$10d%2$10X\n", z, (int)z);
        }
    }
}