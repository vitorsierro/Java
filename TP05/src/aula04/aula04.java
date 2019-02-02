package aula04;



public class aula04 {
	static double nota[] = new double [15];
 
	public static void main(String[] args) {
		float nota[] = {10,5,6,7,8,9,2,4,6,3,3,10,5,6,8};
		
		for (int a = 0; a < nota.length; a++){
			System.out.println("O aluno [" + a + "] e sua nota foi " + nota[a] + " a nota da sua turma foi " + getMediaTotal(nota) );
		}
	}
	private static float getMediaTotal(float nota[]){
		float total = 0;
		 for (int a = 0; a < nota.length; a++){
			total += nota[a];
		} 
		 return total / nota.length;
	 }
}
