package zadania;

public class Zad29 {

	public static void main(String[] args) {

		int n = 7;
		
		do{
			System.out.print(n);
			n= n+7;
		    if (n < 100)
		        System.out.print(", ");
		    else
		        System.out.print(".");
		}while(n<100);

	}

}
