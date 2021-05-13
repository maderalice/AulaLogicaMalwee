package br.com.senai;

import java.util.Scanner;

public class AtividadeTabuada {

	public static void main(String[] args) {
		
		/*
		 * * Crie uam nova classe chamada Tabuada e desenvolva um algoritimo que
		 * receba uma entrada de dados, Scanner(), pedindo que o usuário
		 * informe um número inteiro, em seguida apresente a tabuada do valor
		 * informado pelo usuário;
		  */
		 
		 
		 Scanner tec = new Scanner(System.in);
		 System.out.print("Informe um número: ");
		 
		 int num = tec.nextInt();
		 int multiplicador = 1;
		 
		 while(multiplicador <= 11) {
		 System.out.println(num + " X " + multiplicador + " = " + num * multiplicador);
		 multiplicador++;
		 tec.close();
		 }
		 
		 
		
		
	

	}

}
