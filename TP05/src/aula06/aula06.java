package aula06;

public class aula06 {

	public static void main(String[] args) {
		double VetorA []= {4,9,16,25,36,49,64,81,100,121,144,169,196,225,16,32,95,56,48,30};
		double VetorB [] = new double[20];
		double VetorC [] = new double[20];
		for (int a = 0; a < VetorA.length; a++){
		if (VetorA[a] % 2 == 0){
			VetorB[a] = VetorA[a];
		}else{
			VetorC[a] = VetorA[a];
		}
		
		System.out.println("O Vetor A são " + VetorA[a]);
		if(VetorB[a] != 0.0)
		{
		System.out.println("O Vetor B são " + VetorB[a]);
		}
		if(VetorC[a] != 0.0) 
		{
		System.out.println("O Vetor C são " + VetorC[a]);
		}
		}
	
	}

}
