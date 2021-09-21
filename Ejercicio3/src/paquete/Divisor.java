package paquete;

import java.util.Scanner;

public class Divisor {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un número:");
		numero = sc.nextInt();
		
		for(int posibleDivisor=1;posibleDivisor<numero;posibleDivisor++) {
			if(numero%posibleDivisor==0) {
				System.out.println(posibleDivisor);
			}
		}
		
	}

}
