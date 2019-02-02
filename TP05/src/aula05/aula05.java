package aula05;

import java.util.Scanner;

public class aula05 {
	static double nota[] = new double [15];
	 
	public static void main(String[] args) {
		float nota[] = new float [15];
		Scanner entrada= new Scanner(System.in);
		for (int a = 0; a < nota.length ; a++){
			System.out.println("Digite o valor do aluno[" + a + "] ");
			nota[a] = entrada.nextFloat();
		}
		for (int a = 0; a < nota.length; a++){
			System.out.println("O aluno [" + a + "] e sua nota foi " + nota[a] + " a nota da sua turma foi " + getMediaTotal(nota) );
		}
		entrada.close();
	}
	private static float getMediaTotal(float nota[]){
		float total = 0;
		 for (int a = 0; a < nota.length; a++){
			total += nota[a];
		} 
		 return total / nota.length;
	 }
}
