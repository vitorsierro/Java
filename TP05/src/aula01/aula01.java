package aula01;

import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {
		
		double  array[] = {1.5,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		double  array2[] = new double[15];
		Scanner entrada= new Scanner(System.in);
				
		for (int a = 0; a < array.length; a++){
		
			array2[a] = array [a] * array[a];
			System.out.println("O valor do array2 é " +array2[a]);
		}
		entrada.close();

	}

}
