package zadania;

import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Wprowadz date w postaci: dd.mm.rrrr ");
		System.out.println("Podaj date: ");
		String data = s.nextLine();
		boolean isData = data.length()==10&& data.charAt(2)=='.' && data.charAt(5)=='.';
		StringBuilder w = new StringBuilder(data);
		if(isData){
			int d = Integer.parseInt(data.substring(0, 2));
			int m = Integer.parseInt(data.substring(3, 5));
			int r = Integer.parseInt(data.substring(6, 10));
		
			isData = r>=2000&&r<=2100&&m>=1&&m<=12&&d>=1&&d<=31;
			switch(m){
			case 2:
				if(r%4==0)
					isData = isData && d<=29;
				else
					isData = isData && d<=28;
				break;
			case 4: case 6: case 9: case 11:
			isData = isData && d<=30;
			break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				isData = isData && d<=31;
				break;
				
			}
		}
		if (isData) {
		    try {
		        int dz = Integer.parseInt(data.substring(0, 2));
		        int mc = Integer.parseInt(data.substring(3, 5));
		        int rok = Integer.parseInt(data.substring(6, 10));
		/* Sprawdzenie pozostawiamy bez zmian; bdzie wykonywane tylko
		wtedy, gdy powysze instrukcje wykonaj si poprawnie. */
		    } catch (NumberFormatException e) {
		         isData = false;
		    }
		}
		if(isData)
		System.out.println(data+"Poprawna");
		else
			System.out.println(data+"Niepoprawna");
	}
	
	

}
