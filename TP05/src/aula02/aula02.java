package aula02;

import java.util.Scanner;

public class aula02 {

	public static void main(String[] args) {
		double  array[] = new double[15];
		double  array2[] = new double[15];
		Scanner entrada= new Scanner(System.in);
		for (int a = 0; a < array.length; a++){
			System.out.println("Digite um valor ");
			array [a] = entrada.nextDouble();
		}
		
		for (int a = 0; a < array.length; a++){
		
			array2[a] = array [a] * array[a];
			System.out.println("O valor do array2 é " +array2[a]);
		}
		entrada.close();


	}

}
