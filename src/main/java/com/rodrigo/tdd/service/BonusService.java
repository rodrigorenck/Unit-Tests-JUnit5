package com.rodrigo.tdd.service;

import java.math.BigDecimal;

import com.rodrigo.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionario com salario superior a 10 mil reais nao recebe bonus");
		}
		return valor;
	}

}
