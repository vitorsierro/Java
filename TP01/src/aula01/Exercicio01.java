package aula01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args)
	{
		String nome,ra,turma;
		double np1,np2,mf;
		System.out.println("Digite seu nome completo");
		Scanner leTeclado1= new Scanner(System.in);
		nome = leTeclado1.nextLine();
		
		System.out.println("Digite seu RA");
		Scanner leTeclado2= new Scanner(System.in);
		ra = leTeclado2.nextLine();
		
		System.out.println("Digite sua Turma");
		Scanner leTeclado3= new Scanner(System.in);
		turma = leTeclado3.nextLine();
		
		System.out.println("Digite sua primeira nota");
		Scanner leTeclado4= new Scanner(System.in);
		np1 = leTeclado4.nextDouble();
		System.out.println("Digite sua segunda nota");
		Scanner leTeclado5= new Scanner(System.in);
		np2 = leTeclado5.nextDouble();
			if (np1>=0 && np1 <= 10 && np2>0 && np2 <= 10 ) 
			{
			mf = np1 + np2 / 2;
			
						if (mf > 7) 
					{		
							System.out.println("Olá "+ nome +" " + ra + " da turma "+ turma);
							System.out.println("Voce foi aprovado");	
					}
						else 
					{		
							System.out.println("Olá "+ nome +" com ra " + ra );
							System.out.println("Voce precisa fazer o exame");
					}
			}
		leTeclado1.close();
		leTeclado2.close();
		leTeclado3.close();
		leTeclado4.close();
		leTeclado5.close();
	}

}
