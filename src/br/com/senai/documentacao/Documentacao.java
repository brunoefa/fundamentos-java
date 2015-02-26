package br.com.senai.documentacao;

public class Documentacao {

	/**
	 * Metodo respons�vel por tornar a classe execut�vel
	 * @param args recebe informa��es do sistema operacional
	 */
	public static void main(String[] args) {
		// Coment�rios
		
		/*
		 * Blocos de coment�rios
		 * com mais de uma linha
		 */
		
		imprimir("Texto");
	}
	
	/**
	 * Imprime texto informado no console 
	 * @param texto mensagem que sera impressa
	 */
	private static void imprimir(String texto) {
		System.out.println(texto);
	}

}
