package br.com.senai.controledefluxo;

public class Condicional {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// Estrutura condicional simples
		if (a > b) {
			// Verdadeiro
		}
		
		// Estrutura condicional composta
		if (a > b) {
			// Verdadeiro
		} else {
			// Falso
		}
		
		// Estrutura condicional aninhada
		if (a > b) {
			// Verdadeiro
		} else if (b > 10 && a < 20) {
			// Verdadeiro
		} else {
			// Falso
		}
		
		// Estrutura condicional seletiva
		switch (a) {
		case 1: /* Caso a = 1*/ break;
		case 2: /* Caso a = 1*/ break;
		case 3: /* Caso a = 1*/ break;
		case 4: /* Caso a = 1*/ break;
		case 5: /* Caso a = 1*/ break;
		default: /* Opção padrão */ break;
		} 
		
	}

}
