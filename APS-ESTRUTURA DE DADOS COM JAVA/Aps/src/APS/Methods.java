//---------------------------------Pacotes------------------------------------------------
package APS; 
//--------------------------------Biblioteca--------------------------------------------------------------------------------
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
//---------------------------------Classes-Metodos----------------------------------------	
public class Methods { 
//----------------------------------Variaveis--Globais------------------------------------------------------------------------
		Scanner entrada = new Scanner(System.in); 
        int[] vetor;
        int quantidade;
//---------------------------------Metodo-Construtor--------------------------------------------------------------------------
	public Methods()
	{
	}

//---------------------------------Bubble Sort---------------------------------------------------------------------------------		
	public static void bubbleSort(int[] vet, int fim) {
		 int aux = 0;
			for(int i = 0;i < fim; i++){
			        for(int j = 0; j < fim; j++){
			            if(vet[j] > vet[j + 1]){
			                aux = vet[j];
			                vet[j] = vet[j+1];
			                vet[j+1] = aux;
		            }
		        }
		    }
	}
//---------------------------------QuickSort----------------------------------------------------------------------------------
	public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
               int posicaoPivo = separar(vetor, inicio, fim);
               quickSort(vetor, inicio, posicaoPivo - 1);
               quickSort(vetor, posicaoPivo + 1, fim);
        }
  }

  private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else {
                      int troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }

//---------------------------------MergeSort----------------------------------------------------------------------------------
	private  static void merge(int[] A, int p, int q, int r) {
	      int[] aux = new int[r - p + 1];
	      int a = p;
	      int b = q + 1;
	      int h = 0;
	      while (a <= q && b <= r) {
	          if (A[a] < A[b]) {
	              aux[h++] = A[a++];
	          } else {
	              aux[h++] = A[b++];
	          }
	      }
	      while (a <= q) {
	          aux[h++] = A[a++];
	      }
	      while (b <= r) {
	          aux[h++] = A[b++];
	      }
	      for (h = 0; h < aux.length; h++) {
	          A[p++] = aux[h];
	      }
	  }
	
	public  static void mergeSort(int[] A, int p, int r) {
	      int q = (p + r) / 2;
	      if (p < r) {
	          mergeSort(A, p, q);
	          mergeSort(A, q + 1, r);
	          merge(A, p, q, r);
	      }
	  }
	  
  
//---------------------------------SelectionSort----------------------------------------------------------------------------------
		 
	    public static int[] doSelectionSort(int[] arr){
	    
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[index]) 
	                    index = j;
	      
	            int smallerNumber = arr[index];  
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        return arr;
	    }
//------------------------------------Vetor--Desordenado--------------------------------------------------------------------	    
	     public int[] vetorDesordenado() {
	    	 
	    	 vetor = new int[quantidade];
				for (int i = 0; i < vetor.length; i++) {
	                vetor[i] = (int) (Math.random()*quantidade);
	        }
				
				return vetor;
	     }
  
//---------------------------------Metodo-Iniciar-----------------------------------------------------------------------------	
	 public void iniciar() throws IOException 
		{
			
			
		 	exibe();
		 	System.out.println("Qual o tamanho do vetor que você deseja para efetuar os cálculos");
			System.out.println("recomendo maior que 10.000 pois fica mais fácil de visualizar");

			quantidade = entrada.nextInt();
			vetorDesordenado();
			prints();
				
			}
//---------------------------------Exibe-Menu---------------------------------------------------------------------------------
	 public void exibe()
		{
		
			System.out.println("Metodologias utilizadas");
			System.out.println("1 - BubbleSort");
			System.out.println("2 - QuickSort");
			System.out.println("3 - MergeSort");
			System.out.println("4 - SelectionSort");
			
	
		}
//---------------------------------Escolher-Prints-----------------------------------------------------------------------------
	 public void prints() 
		{
		 int[] som1 = new int[4];	
         String[] let = {"QuickSort","BubbleSort","MergeSort","SelectionSort"};	
         int[] soma = new int[4];
	
         try {
		 		    long tempoInicial = System.currentTimeMillis();

			        bubbleSort(vetor,vetor.length-1);

			        long tempoFinal = System.currentTimeMillis();
			         soma[0] = (int) (tempoFinal - tempoInicial);
			        
			        System.out.println("Executado em BubbleSort = " + (tempoFinal - tempoInicial) + " ms");
		
			       			        
			        tempoInicial = System.currentTimeMillis();

			        quickSort(vetor,0,vetor.length-1);

			         tempoFinal = System.currentTimeMillis();
		
			         soma[1] = (int) (tempoFinal - tempoInicial);
			         System.out.println("Executado em quickSort = " + (tempoFinal - tempoInicial) + " ms");
				    tempoInicial = System.currentTimeMillis();

			        mergeSort(vetor,0,vetor.length-1);

			        tempoFinal = System.currentTimeMillis();
			        soma[2] = (int) (tempoFinal - tempoInicial);
			        System.out.println("Executado em MergeSort = " + (tempoFinal - tempoInicial) + " ms");
			       		
			        tempoInicial = System.currentTimeMillis();

			        doSelectionSort(vetor);

       	           tempoFinal = System.currentTimeMillis();
       	           soma[3] = (int) (tempoFinal - tempoInicial);
       	           System.out.println("Executado em SelectionSort = " + (tempoFinal - tempoInicial) + " ms");
       	          /* 	
       	           		for(int i =0 ;i <soma.length;i++)
       	           		{
       	           			som1[i] = soma[i];	
       	           		}
       	           		quickSort(soma,0,soma.length-1);
		       	        System.out.println("Vetor organizado:");
			       		    for(int q = 0; q < soma.length; q++)
			       		    {
			       		    	for(int j = 0; j < soma.length; j++)
			       		    	{
				       		    	if (soma[q] == som1[j])
				       		    	{
				       		    	System.out.println(let[j]+" "+soma[q]+ "ms");
	    							}
			       		    	}
			       		    }*/
			       		   
			               
		 				}catch(IndexOutOfBoundsException e) {
		 					 e.printStackTrace();
		 					JOptionPane.showMessageDialog(null, "Error no vetor","Error", JOptionPane.INFORMATION_MESSAGE);
		       		    }
    		   
       	           
		}
	
		}//fecha a classe Methods
		



