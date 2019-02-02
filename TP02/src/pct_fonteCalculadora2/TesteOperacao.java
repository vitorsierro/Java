package pct_fonteCalculadora2;
import java.util.Scanner;

public class TesteOperacao {

	public static void main(String[] args) {
		
		Operacao calc = new Operacao();
		
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
					System.out.println("O valor da sua soma �: " + calc.soma(valor01, valor02) );
			break;
			
			case 2:
				System.out.println("O valor da sua subtra��o �: " + calc.subt(valor01, valor02) );
			break;
			
			case 3:
				System.out.println("O valor da sua multiplica��o �: " + calc.mult(valor01, valor02) );
			break;
			
			case 4:
				if (valor01 > valor02){
					 System.out.println("O valor da sua divis�o �: "+ calc.div(valor01,valor02) );
					}
				else {
					System.out.println("O valor da sua divis�o � impossivel pois "+valor01 + " e menor que o "+ valor02);
				}
			break;
			default:
			 System.out.println("Impossivel de fazer operador invalido");
			break;
		}
	
		leTeclado01.close();
		leTeclado02.close();
		leTeclado03.close();
		

	}

}
