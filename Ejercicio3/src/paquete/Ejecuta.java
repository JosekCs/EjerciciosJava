package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int numero;
		int otroNumero;
		boolean continuar = false;
		
		System.out.println("Introduzca	número:");
		numero=sc.nextInt();
		
		do {
			
			
			System.out.println("Introduzca otro	número:");
			otroNumero=sc.nextInt();
			
			if(numero==otroNumero) {
				continuar = true;
			}
			
		}while(continuar==true);
	}

}
