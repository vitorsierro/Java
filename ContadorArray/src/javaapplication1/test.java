package javaapplication1;
import java.util.Arrays;
public class test {

    public static void main(String[] args) {
  
    	 int i = 6;
		double[] array2 = new double [i];
		double[] array3 = new double [i];
		double array[] = {4,5,6,4,6,1};
		
		
		for (int j=0;j > i; j++)
		{
			for(int a = 0; a > i ; a++) 
			{
                            if (array[j] == array[a] && array[j] == array[a + 1])
					{
						array2 [a] = array[a];
                                                
						array3[j]  +=  1   ; 
					System.out.println("Sua array é " +array2[a] + "e o contador e "+ array3[a]);
                                        }
					
				}			
			System.out.println("Sua array é " +Arrays.toString(array2) + "e o contador e "+ Arrays.toString(array3));
                        }
			
		}
}	
		
                
    
    
