package pct_fonteFatorial;
import java.util.Scanner;

public class Fatorial02 {

	public static void main(String[] args) {
		TesteFatorial02 tf = new TesteFatorial02();
		
		System.out.println("Digite um valor para fatora: ");
		Scanner leTeclado01 = new Scanner (System.in);
		int f = leTeclado01.nextInt();
		System.out.println("O numero fatorado é " + tf.fat(f));

leTeclado01.close();
	}
}
