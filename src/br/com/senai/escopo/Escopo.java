package br.com.senai.escopo;

public class Escopo {
	
	public static void main(String[] args) {
		
		// Escopo de estruturas de controle de fluxo
		for (int i = 0; i < 100; i++) {
			int a = 10;
			System.out.println(a);
		}
		// Erro! a já não existe mais aqui
		// System.out.println(a);
		
		if (10 < 20) {
			int c = 10;
			System.out.println(c);
		}
		// Erro! c já não existe mais aqui
		// System.out.println(c);
	}
}
