package aula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double sal, reajsal, salalt;
		String func;
		int carg;
		System.out.println("Digite o nome do funcionario");
		Scanner leTeclado1= new Scanner(System.in);
		func = leTeclado1.nextLine();
		
		System.out.println("Digite seu numero no cargo certo : 1-Gerente 2-Tecnicos 3-Auxiliares 4-Outros");
		Scanner leTeclado2= new Scanner(System.in);
		carg = leTeclado2.nextInt();
		
		System.out.println("Digite seu Salario");
		Scanner leTeclado3= new Scanner(System.in);
		sal = leTeclado3.nextDouble();
			
		switch(carg)
			{
					case 1 :
					
					 reajsal = sal * 0.05;
					 salalt = reajsal + sal;
					 System.out.println("Olá "+ func +" com o "+ carg + "seu salario era "+ sal + "agora é "+ salalt);
				break;
				
					case 2 :
					
						reajsal = sal * 0.075;
						salalt = reajsal + sal;			
						System.out.println("Olá "+ func +" com o "+ carg + "seu salario era "+ sal + "agora é "+ salalt);
				break;
				
					case 3 :			 
						 reajsal = sal * 0.10;
						 salalt = reajsal + sal;
						 System.out.println("Olá "+ func +" com o "+ carg + "seu salario era "+ sal + "agora é "+ salalt);
				break;
				
					case 4 :	 
						 
						reajsal = sal * 0.04;
						salalt = reajsal + sal;
						System.out.println("Olá "+ func +" com o "+ carg + "seu salario era "+ sal + "agora é "+ salalt);
				break;
				 	default :
				 		System.out.println("Voce digitou um numero invalido");
				 break;
			}
		leTeclado1.close();
		leTeclado3.close();
		leTeclado2.close();
		
	}

}
