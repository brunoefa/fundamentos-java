package br.com.senai.documentacao;

public class Documentacao {

	/**
	 * Metodo responsável por tornar a classe executável
	 * @param args recebe informações do sistema operacional
	 */
	public static void main(String[] args) {
		// Comentários
		
		/*
		 * Blocos de comentários
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
