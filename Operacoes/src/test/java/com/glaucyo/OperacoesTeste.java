package com.glaucyo;

import org.junit.Test;

import com.glaucyo.Operacoes;

import org.junit.Assert;

public class OperacoesTeste {
	
	@Test
	public void somaTeste() {
		Operacoes operacoes = new Operacoes(3,3);
		int ret = operacoes.soma();
		Assert.assertEquals(6, ret);
	}
	
	@Test
	public void subtracaoTeste() {
		Operacoes operacoes = new Operacoes(5,3);
		int ret = operacoes.subtracao();
		Assert.assertEquals(2, ret);
	}

}
