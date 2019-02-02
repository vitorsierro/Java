package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		String nome,ra,turma;
		int dia;
		
		
		System.out.println("Digite seu nome completo");
		Scanner leTeclado1= new Scanner(System.in);
		nome = leTeclado1.nextLine();
		
		System.out.println("Digite seu RA");
		Scanner leTeclado2= new Scanner(System.in);
		ra = leTeclado2.nextLine();
		
		System.out.println("Digite sua Turma");
		Scanner leTeclado3= new Scanner(System.in);
		turma = leTeclado3.nextLine();
		
		System.out.println("Digite um numero que equivale a um dia da semana 1-Segunda-Feira 2-Terça-Feira 3-Quarta-Feira 4-Quinta-Feira 5-Sexta-Feira 6- Sabado 7-Domingo");
		Scanner leTeclado4= new Scanner(System.in);
		dia = leTeclado4.nextInt();
		switch(dia) {
			case 1 :
				System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
				System.out.println("Segunda-Feira");
		break;
			case 2 : 
				System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
				System.out.println("Terça-Feira");
		break;
			case 3 :
				System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
				System.out.println("Quarta-Feira");
		break;
			case 4 : 
				System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
				System.out.println("Quinta-Feira");
		break;
			case 5 : 
				System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
				System.out.println("Sexta-Feira");
		break;
			case 6 :
				System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
				System.out.println("Sabado");
		break;
			case 7 : 
				System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
				System.out.println("Domingo");
			default :
		 		System.out.println("Voce digitou um numero invalido");
		 break;
			
		}
		leTeclado1.close();
		leTeclado2.close();
		leTeclado3.close();
		leTeclado4.close();
		
	}

}
