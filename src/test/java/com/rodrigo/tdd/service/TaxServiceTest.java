package com.rodrigo.tdd.service;

import com.rodrigo.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxServiceTest {

    private TaxService service;

    @BeforeEach
    public void inicializar(){
        this.service = new TaxService();
    }

    @Test
    @DisplayName("Imposto Deveria Ser 0 Para Salarios Menores Que 1000")
    public void impostoDeveriaSer0(){
        BigDecimal imposto = service.calcularImposto(new Funcionario("x", LocalDate.now(), new BigDecimal("999")));
        assertEquals(BigDecimal.ZERO, imposto);
    }

    @Test
    @DisplayName("Imposto Deveria Ser 15% Para Salarios Maiores Que 1000")
    public void impostoDeveriaSer15PorCento(){
        int salario = 2000;
        BigDecimal imposto = service.calcularImposto(new Funcionario("x", LocalDate.now(), new BigDecimal(salario)));
        double vintePorCento = 0.20*salario;
        assertEquals(new BigDecimal(vintePorCento).setScale(1), imposto);
    }

    @Test
    @DisplayName("Imposto Deveria Ser 0 Para Salarios Exatamente Iguais A 1000")
    public void impostoDeveriaSer0para1000(){
        int salario = 1000;
        BigDecimal imposto = service.calcularImposto(new Funcionario("x", LocalDate.now(), new BigDecimal(salario)));
        assertEquals(BigDecimal.ZERO, imposto);
    }



}