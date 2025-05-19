package calculadoraConsole;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		int n = sc.nextInt();
		
		switch (n){
			case 1:
				System.out.print("A: ");
				double somaA = sc.nextDouble();
				System.out.print("B: ");
				double somaB = sc.nextDouble();
				System.out.println(somaA + somaB);
				break;
			case 2:
				System.out.print("A: ");
				double subA = sc.nextDouble();
				System.out.print("B: ");
				double subB = sc.nextDouble();
				System.out.println(subA - subB);
				break;
			case 3:
				System.out.print("A: ");
				double multA = sc.nextDouble();
				System.out.print("B: ");
				double multB = sc.nextDouble();
				System.out.println(multA * multB);
				break;
			case 4:
				System.out.print("A: ");
				double divA = sc.nextDouble();
				System.out.print("B: ");
				double divB = sc.nextDouble();
				if (divB == 0) {
					System.out.println("Não é possível realizar divisão por zero!");
					break;
				} else {
					System.out.println(divA / divB);
				}
				break;
		}
		
		sc.close();
	}

}
