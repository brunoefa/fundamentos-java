package br.com.senai.tipos;

public class Cast {

	public static void main(String[] args) {
		int inteiro;
		double decimal;
		
		inteiro = 10;
		decimal = 2.1;
		
		inteiro = 10 + 20;
		decimal = 3 + 5.5;
		
		// Erro de compilação
		// inteiro = 10 + decimal;
		
		// Casting
		// Converte o valor double ignorando 
		// as casas decimais para inteiro
		inteiro = 10 + (int)decimal;
		
		// Converte o valor inteiro para double 
		// sem a necessidade de casting
		decimal = 2.1 + inteiro;
		
		// Não é possível cast de qualquer tipo
		// boolean buleano = true;
		// decimal = 2.0 + (double)buleano;
		// inteiro = 1 + (int)buleano;

		System.out.println("inteiro: " + inteiro);
		System.out.println("decimal: " + decimal);
	}

}
