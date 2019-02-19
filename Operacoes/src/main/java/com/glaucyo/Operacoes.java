package com.glaucyo;

public class Operacoes {
	
	private int numero1; 
	private int numero2;
	
	public Operacoes() {
		
	}
	
	public Operacoes(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int soma() {
		return numero1 + numero2;
	}

	public int subtracao() {
		return numero1 - numero2;
	}
}
