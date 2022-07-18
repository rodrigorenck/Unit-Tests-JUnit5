package com.rodrigo.tdd.service;

import com.rodrigo.tdd.modelo.Desempenho;
import com.rodrigo.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal porcentagem = desempenho.getPorcentagemReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(porcentagem);
        funcionario.reajustarSalario(reajuste);
    }
}
