package aula03;

import java.util.Scanner;

public class aula03 {

	public static void main(String[] args) {
		double  array[] = {2.25,4,9,16,25,36,49,64,81,100,121,144,169,196,225};
		double  array2[] = new double[15];
		Scanner entrada= new Scanner(System.in);
				
		for (int a = 0; a < array.length; a++){
		
			array2[a] = Math.sqrt(array[a]);
			System.out.println("O valor do array2 é " +array2[a]);
		}
		entrada.close();


	}

}
