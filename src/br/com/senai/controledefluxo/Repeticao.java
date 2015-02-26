package br.com.senai.controledefluxo;


public class Repeticao {
	
	public static void main(String[] args) {
		int a = 2000;
		
		// Enquanto
		while (a <= 1000) {
			// Se repete enquanto a condi��o for atendida  
			System.out.println("while");
		}
		
		// Repita at�
		do {
			System.out.println("do");
		} while (a <= 1000);
		
		
		// Declara��o de uma lista de inteiros
		int[] lista = {4,6,3,15,2,6,4,6,3};
		
		// Para (lindo)
		for (int i = 0; i < lista.length; i++) {
			System.out.println("for: " + lista[i]);
		}
		
		// Para cada (mais lindo ainda)
		for (int elemento : lista) {
			System.out.println("foreach: " + elemento);
		}
	}
	
}
