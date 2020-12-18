//Realizar un programa que lea 5 cadenas y nos diga cuál es la mayor de
//ellas alfabéticamente.


import java.util.Scanner;

public class Mayor_Ej12
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadenas[] = new String[5];
		String base = null;
		for(int i=0;i<cadenas.length;i++) {
			System.out.println("Dame una palabra: ");
			cadenas[i] = teclado.nextLine();
		}
		teclado.close();
		base = cadenas[0];
		for(int i=0;i<cadenas.length;i++) {
			if(cadenas[i].compareTo(base)>0) {
				base = cadenas[i];
			}
		}
		System.out.println("la cadena alfabeticamente mayor es: " + base);
	}

}
