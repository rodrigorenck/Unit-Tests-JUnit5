package com.rodrigo.tdd.modelo;

import com.rodrigo.tdd.service.FeriasService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;
	private boolean direitoAferias;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public boolean getDireitoAFerias(){
		return direitoAferias;
	}

	public void checkFerias(){
		FeriasService service = new FeriasService();
		service.verificaFerias(this);
	}

	public long getTempoEmpresaMeses(){
		Period periodo = Period.between(this.getDataAdmissao(), LocalDate.now());
		return periodo.toTotalMonths();
	}

	public void reajustarSalario(BigDecimal reajuste) {
		salario = salario.add(reajuste);
		arredondarSalario();
	}

	private void arredondarSalario() {
		salario = salario.setScale(2, RoundingMode.HALF_UP);
	}
}
