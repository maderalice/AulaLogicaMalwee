package br.com.senai;

import java.util.Scanner;

public class AtividadeLogica {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String continuar = "s";
		int opcao;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1) Verificar sexo e idade");
			System.out.println("2) Contagem de valores");
			System.out.println("3) Tabuada");
			System.out.println("4) Cadastrar cursos");
			System.out.println("Informe a op��o desejada: ");
			opcao = tec.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("--- VERIFICAR SEXO E IDADE ---");
				System.out.println("Informe seu nome: ");
				String nome = tec.next();
				System.out.println("Informe seu ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				System.out.println("Informe seu sexo [M/F]: ");
				String sexo = tec.next();
				int idade = 2021 - anoDeNascimento;
				
				if (sexo.equalsIgnoreCase("M")) {
					System.out.println("Voc� � do sexo masculino");
				} else if (sexo.equalsIgnoreCase("F")) {
					System.out.println("Voc� � do sexo feminino");
				} else if (!sexo.equalsIgnoreCase("M") || !sexo.equalsIgnoreCase("F")) {
					System.out.println("Op��o inv�lida!"); 
					}
				
				if (idade < 12) {
	                System.out.println("Voc� ainda � crian�a");
	                
				}else if(idade >= 12 && idade < 18) {
	                System.out.println("Voc� � jovem");
	                
				}else if (idade >= 18 && idade < 65) {
	                System.out.println("Voc� � adulto");
	                
				}else {
	                System.out.println("Voc� j� � idoso");
				}
				
	            if(idade < 16) {
	                System.out.println("Voc� n�o pode votar");
	                
	            }else if ((idade >= 16 && idade < 18) || idade > 70) {
	                System.out.println("seu voto � opcional");
	                
	            }else {
	                System.out.println("seu voto � obrigat�rio");
	            
	            if(idade < 18) {
	                System.out.println("Voc� n�o pode tirar a habilita��o");
	            }else {
	                System.out.println("Voc� j� pode tirar a habilita��o");
	            }
	           }
	           break;
					
			case 2:
				
				System.out.println("--- CONTAGEM DE VALORES ---");
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
				
				else {
					System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia");
				}
				break; 
			
			case 3:
				
				System.out.println("--- TABUADA ---");
				System.out.println("Informe um valor inteiro: ");
				int valor = tec.nextInt();
				int multiplicador = 0;
				
				do {
					System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
					multiplicador++;
				} while(multiplicador <= 10);
				
				
				break;
			
			case 4: 
				
				String [] cursos = new String [5];
				String inserirCurso = "s";
				int aux = 0;
				System.out.println("4 - Cadastrar cursos");
				System.out.println(" ");
				while(inserirCurso.equalsIgnoreCase("s") && aux < 5) {
					System.out.print("Informe o curso: ");
					cursos[aux] = tec.next();
					aux++;
					if(aux < 5) {
					System.out.print("Deseja inseir outro curso? ");
					inserirCurso = tec.next();
					}
					else {
						
					}
				}
				System.out.print("CURSOS:");
				if(aux == 1) {
				System.out.println(cursos[0]+".");
				}
				else if(aux == 2) {
					System.out.println(cursos[0]+","+cursos[1]+".");
				}
				else if(aux == 3) {
					System.out.println(cursos[0]+","+cursos[1]+","+cursos[2]+".");
				}
				else if(aux == 4) {
					System.out.println(cursos[0]+","+cursos[1]+","+cursos[2]+","+cursos[3]+".");
				}
				else {
					System.out.println(cursos[0]+","+cursos[1]+","+cursos[2]+","+cursos[3]+","+cursos[4]+".");
				}	break; 
				
				case 5:
					continuar = "n";
					break;
					
				default:
					System.out.println("Op��o Inv�lida!");
					break;
				}

			} while (continuar.equalsIgnoreCase("s"));
			System.out.println("Sistema finalizado!!");
		}
	}