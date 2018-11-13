package zadania;

public class Zad33 {

	public static void main(String[] args) {

		int a, b, c;
		a=1;
		b=1;
		c=a+b;
		
		do{
			System.out.print(" , "+c);
			a=b;
			b=c;
			c=a+b;
		}while(c<1000);

	}

}
