package test_calculadora;

public class Codigo {
	 private float nota1;
	 private float nota2;
	 private float lista;
		 
	 public Codigo() 
	 {
	 }

	private float getNota1() {
		return nota1;
	}



	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}



	private float getNota2() {
		return nota2;
	}



	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}



	private float getLista() {
		return lista;
	}



	public void setLista(float lista) {
		this.lista = lista;
	}
	
	public  float calcular()
	{
		
		float nota1 = getNota1() ;
		float nota2 = getNota2();
		float lista = getLista();
		float calc = 0;
		calc = (nota1 + nota2 + lista)/3;
		return calc;
	}
}
