package br.com.senai.operadores;

public class Logicos {

	public static void main(String[] args) {
		boolean r, a, b;
		
		a = false;
		b = true;
		
		// && And / E
		r = a && b;
		
		// || Or / Ou
		r = a || b;
		
		// ! Not / Nega��o / Invers�o
		r = !a;
		
		System.out.println(r);
	}

}
