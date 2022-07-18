package com.rodrigo.tdd.service;

import com.rodrigo.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FeriasServiceTest {

    private FeriasService service;

    @BeforeEach
    public void inicializar(){
        this.service = new FeriasService();
    }


    @Test
    @DisplayName("Ferias False Para Funcionarios Com Menos de 12 Meses na Empresa")
    public void feriasFalseParaFuncionariosComMenosDe12MesesNaEmpresa(){
        boolean verifica = service.verificaFerias(new Funcionario("x", LocalDate.of(2021, Month.DECEMBER, 19), new BigDecimal("10000")));
        assertFalse(verifica);
    }

    @Test
    @DisplayName("Ferias True Para Funcionarios Com Mais de 12 Meses na Empresa")
    public void feriasTrueParaFuncionariosComMaisDe12MesesNaEmpresa(){
        boolean verifica = service.verificaFerias(new Funcionario("x", LocalDate.of(2020, Month.DECEMBER, 19), new BigDecimal("10000")));
        assertTrue(verifica);
    }

    @Test
    @DisplayName("Ferias True Para Funcionarios Com Exatamente 12 Meses de Empresa")
    public void feriasTrueParaFuncionariosComExatamente12MesesNaEmpresa(){
        boolean verifica = service.verificaFerias(new Funcionario("x", LocalDate.of(2021, Month.JULY, 11), new BigDecimal("10000")));
        assertTrue(verifica);
    }



}