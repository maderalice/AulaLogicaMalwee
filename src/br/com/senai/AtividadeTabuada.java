package br.com.senai;

import java.util.Scanner;

public class AtividadeTabuada {

	public static void main(String[] args) {
		
		/*
		 * * Crie uam nova classe chamada Tabuada e desenvolva um algoritimo que
		 * receba uma entrada de dados, Scanner(), pedindo que o usu�rio
		 * informe um n�mero inteiro, em seguida apresente a tabuada do valor
		 * informado pelo usu�rio;
		  */
		 
		 
		 Scanner tec = new Scanner(System.in);
		 System.out.print("Informe um n�mero: ");
		 
		 int num = tec.nextInt();
		 int multiplicador = 1;
		 
		 while(multiplicador <= 11) {
		 System.out.println(num + " X " + multiplicador + " = " + num * multiplicador);
		 multiplicador++;
		 tec.close();
		 }
		 
		 
		
		
	

	}

}
