package model;

public class Aeronave {
	
	private String modelo;
	
	private String porte; //Pequeno, médio ou grande
	
	private String companhia; //Avianca, Latam, Gol e outros
		
	private String ano;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	 public void acelerar() {
		 System.out.println("O avião de modelo " + this.modelo +" "+ this.companhia + " esta acelerando!");
		 System.out.println("");
	 }
	 
	 public void desacelerar() {
		 System.out.println("O avião de modelo " + this.modelo +" "+ this.companhia + " esta desacelerando!");
		 System.out.println("\n---------------------------------------------------------\n");
	 }
}