package pct_fonteCalculadora;
import java.util.Scanner;


public class TesteOperacaoAritmetica 
{

	public static void main(String[] args) 
	{
		System.out.println("Digite um valor: ");
		Scanner leTeclado01 = new Scanner (System.in);
		int valor01 = leTeclado01.nextInt();
		
		System.out.println("Digite segundo valor: ");
		Scanner leTeclado02 = new Scanner (System.in);
		int valor02 = leTeclado02.nextInt();
		
		System.out.println("Digite um Operador com o seu numero respectivo + = 1, - = 2, * = 3, / = 4 ");
		Scanner leTeclado03 = new Scanner (System.in);
		int operador = leTeclado03.nextInt();
		

		switch(operador)
		{
			case 1: 
					System.out.println("O valor da sua soma é:" + soma(valor01, valor02) );
			break;
			
			case 2:
				System.out.println("O valor da sua subtração é:" + subt(valor01, valor02) );
			break;
			
			case 3:
				System.out.println("O valor da sua multiplicação é:" + mult(valor01, valor02) );
			break;
			
			case 4:
				if (valor01 > valor02){
					 System.out.println("O valor da sua divisão é: "+ div(valor01,valor02) );
				 }
			break;
			default:
			 System.out.println("Impossivel de fazer");
			break;
		}
	
		leTeclado01.close();
		leTeclado02.close();
		leTeclado03.close();
		
	}
	public static int soma(int valor01,int valor02)
	{
	return 	valor01 + valor02;
	}
	public static int subt(int valor01,int valor02)
	{
		return valor01 - valor02;
	}
	public static int mult(int valor01,int valor02)
	{
	return  valor01 * valor02;
	}
	public static  int div(int valor01,int valor02)
	{
	return valor01 / valor02;	 
	}

	
}
