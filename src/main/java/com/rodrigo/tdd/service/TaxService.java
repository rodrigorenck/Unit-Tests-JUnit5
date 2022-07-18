package com.rodrigo.tdd.service;

import com.rodrigo.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class TaxService {

	public BigDecimal calcularImposto(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario();
		if(valor.compareTo(new BigDecimal("1000")) <= 0){
			return BigDecimal.ZERO;
		}
		return valor.multiply(new BigDecimal("0.2"));
	}

}
