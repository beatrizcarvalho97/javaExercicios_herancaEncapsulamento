package main;

import model.Aeronave;
import model.Carro;
import model.Eletrodomestico;
import model.Moto;

public class Main {

	public static void main(String[] args) {
		
		//Exercício 1
		
		Aeronave aeronave = new Aeronave();
		
		aeronave.setModelo("737 Max");
		aeronave.setAno("2020");
		aeronave.setCompanhia("Boeing");
		aeronave.setPorte("médio");
		
		aeronave.acelerar();
		aeronave.desacelerar();
		
		//Exercício 1.5
		
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		
		eletrodomestico.setTipo("ferro de passar");
		eletrodomestico.setMarca("Electrolux");
		
		eletrodomestico.ligar();
		eletrodomestico.desligar();
		
		//Exercícios 2 e 3
		
		Carro carro = new Carro();
		
		carro.setModelo("Uno");
		carro.setMarca("Fiat");
		carro.setArCondicionado(false);
		carro.setCor("Prata");
		carro.setNumeroPortas("4");
		carro.setLugares("5");
		carro.setVelocidadeAtual(80);
		carro.setVelocidadeMaxima(65);
		
		carro.acelerar();
		carro.puxarFreioDeMao();
		carro.ligarRadio();
		carro.curva();
		
		Moto moto = new Moto();
		
		moto.setModelo("CG 160");
		moto.setMarca("Honda");
		moto.setCor("Vermelha");
		moto.setAroRodas("160");
		moto.setCilindradas("165 cc");
		moto.setVelocidadeAtual(30);
		moto.setVelocidadeMaxima(50);
				
		moto.acelerar();
		moto.curva();
	}
}
