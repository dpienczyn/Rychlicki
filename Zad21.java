package zadania;

import java.util.Scanner;

public class Zad21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wprowadz date wedlug schematu : dd.mm.rrrr ");
		String data = s.nextLine();
		boolean isDate = data.length()==10;
		if(isDate){
			/* Jeli acuch ma waciw dugo , to sprawdzamy,
			czy skada si z waciwych znaków. Znaki o indeksie 2 i 5
			powinny by  kropkami, a pozostae znaki cyframi. */
			isDate = Character.isDigit(data.charAt(0));
			isDate = Character.isDigit(data.charAt(1));
			isDate = data.charAt(2)=='.';
			isDate = Character.isDigit(data.charAt(3));
			isDate = Character.isDigit(data.charAt(4));
			isDate = data.charAt(5)=='.';
			isDate = Character.isDigit(data.charAt(6));
			isDate = Character.isDigit(data.charAt(7));
			isDate = Character.isDigit(data.charAt(8));
			isDate = Character.isDigit(data.charAt(9));
			
		}
		/* Jeli acuch znaków jest poprawnie zbudowany, to wyznaczamy
		wartoci zmiennych dz (dzie), mc (miesic) i rok. Nastpnie
		sprawdzamy poprawno  tych danych. */
		if(isDate){
			int dz = Integer.parseInt(data.substring(0, 2));
			int mie = Integer.parseInt(data.substring(3, 5));
			int rok = Integer.parseInt(data.substring(6, 10));
			/* Sprawdzamy, czy rok naley do danego stulecia (wieku),
			czy numer miesi
			ca naley do zakresu od 1 do 12 oraz czy
			numer dnia nie przekracza 31. */
			isDate = rok>=2000&&rok<2019&&isDate&&mie>=1&&mie<=12&&dz>=1&&dz<=31;
			/* Dla kwietnia, czerwca, wrzenia i pa dziernika sprawdzamy,
			czy numer dnia nie przekracza 30. */
			if(mie==4||mie==6||mie==9||mie==10)
				isDate=isDate&&dz<=30;
			/* Dla lutego w roku przestpnym sprawdzamy, czy numer dnia
			nie przekracza 29. */
			if(mie==2&&rok%4==0)
				isDate = isDate&&dz<=29;
			/* Dla lutego w roku zwykym sprawdzamy, czy numer dnia nie
			przekracza 28.*/
			if(mie==2&&rok%4!=0)
				isDate= isDate&&dz<=28;
			/* W zalenoci od wartoci zmiennej logicznej isDate wywietlamy
			stosown odpowied . */
		}
		if(isDate)
			System.out.println(data+" -poprawana data");
		else
			System.out.println(data+" -niepoprawna data");
		}

}
