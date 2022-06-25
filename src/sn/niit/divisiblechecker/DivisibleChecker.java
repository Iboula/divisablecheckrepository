package sn.niit.divisiblechecker;

import java.util.Scanner;

public class DivisibleChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int nombre1, nombre2;
		
		System.out.println("Entrer le premier nombre: ");
		nombre1 = scanner.nextInt();
		
		System.out.println("Entrer le deuxième nombre: ");
		nombre2 = scanner.nextInt();
		DivisibleChecker divisibleChecker = new DivisibleChecker();
		
		if (nombre2 == 0) {
			System.out.println("Le deuxième nombre ne doit pas être égal à zéro ");
		}
		else {
			if (divisibleChecker.isDivisible(nombre1, nombre2)) {
				System.out.println(nombre1 + " est divisible par "+ nombre2);
			}
			else {
				System.out.println(nombre1 + " n'est divisible par "+ nombre2);
			}
		}
	}

	public boolean isDivisible(int nombre1, int nombre2) {
		
			if (nombre1 % nombre2 == 0) {
				return true;
			}
			else {
				return false;
			}
	}
}
