package model;

public class Carro extends Veiculo{
	
	private String numeroPortas;
	private boolean arCondicionado;
	
	public String getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(String numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	public void puxarFreioDeMao() {
		System.out.println("Ao parar o seu "+getModelo()+" n�o se esque�a de puxar o freio de m�o!");
		System.out.println("");
	}
	
	public void ligarRadio() {
		System.out.println("Para ligar o r�dio do seu "+getModelo()+" pressione o bot�o POWER.");
		System.out.println("");
	}
}
