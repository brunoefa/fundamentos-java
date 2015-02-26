package br.com.senai.controledefluxo;

public class Interrupcoes {
	public static void main(String[] args) {

		// break - interrompe a execução de um loop
		// continue - da sequencia a iteração

		int n = 2;
		switch (n) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
		
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.println("pin");
				continue;
			}
			System.out.println("n: " + i);
		}
		
	}
}
