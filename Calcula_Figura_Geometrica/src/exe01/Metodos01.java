package exe01;

public class Metodos01 {
	private double lado;
	private double base;
	private double altura;
	
	private double raio;
	
	private double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	private double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	private double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	private double getRaio() {
		return raio;
	}
	public void setRaio(double circulo) {
		this.raio = circulo;
	}
	public double Triangulo() {
		 double area = (this.base*this.altura)/2;
		return area;	
	}
	public double Quadrado() {
		double area = Math.pow(this.lado, 2);
		return area;
	}
	public double Retangulo() {
		double area = this.base * this.altura;
		return area;
	}
	
	public double Circulo() {
		double area = Math.PI * Math.pow(this.raio,2);
		return area;
	}
		
}
