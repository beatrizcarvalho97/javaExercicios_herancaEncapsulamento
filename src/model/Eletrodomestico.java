package model;

public class Eletrodomestico {
	
	private String tipo;
	
	private String marca;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ligar () {
		System.out.println("O equipamento "+this.tipo+" da marca"+" "+this.marca+" esta ligado!");
		System.out.println("");
	}
	public void desligar() {
		System.out.println("O equipamento "+this.tipo+" da marca"+" "+this.marca+" esta desligado!");
		System.out.println("\n---------------------------------------------------------\n");
	}
}