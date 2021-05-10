package br.com.senai;

import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		if (valor1 < valor2) {
			while (valor1 <= valor2) {
				System.out.println(valor1);
				valor1++;
			}
		}
		else if (valor1 > valor2){
			while (valor1 >= valor2) {
				System.out.println(valor2);
				valor1--;
			}
		}
	}

}
