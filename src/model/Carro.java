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
		System.out.println("Ao parar o seu "+getModelo()+" não se esqueça de puxar o freio de mão!");
		System.out.println("");
	}
	
	public void ligarRadio() {
		System.out.println("Para ligar o rádio do seu "+getModelo()+" pressione o botão POWER.");
		System.out.println("");
	}
}
