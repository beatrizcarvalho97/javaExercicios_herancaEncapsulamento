package model;

public class Veiculo {

	private String marca;
	private String cor;
	private String lugares;
	private String modelo;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getLugares() {
		return lugares;
	}
	public void setLugares(String lugares) {
		this.lugares = lugares;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public void acelerar() {
		if(this.velocidadeAtual >= this.velocidadeMaxima) {
			System.out.println("O(a) "+ this.marca + " "+ this.modelo+" está acelerando.");
			System.out.println("");
		} else {
			System.out.println("O(a) "+ this.marca + " "+ this.modelo+" está desacelerando.");
			System.out.println("");
		}
	}
	
	public void curva() {
		if(this.velocidadeAtual >= 70) {
			System.out.println("Cuidado!! Seu(Sua) "+this.modelo+" vai capotar!");
			System.out.println("");
		} else {
			System.out.println("Parabéns! Seu(sua) "+this.modelo+" esta trafegando em velocidade segura!");
			System.out.println("");
		}
	}
}