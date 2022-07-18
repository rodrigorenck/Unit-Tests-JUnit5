package com.rodrigo.tdd.service;

import com.rodrigo.tdd.modelo.Desempenho;
import com.rodrigo.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        System.out.println("inicio");
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("x", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    public void finalizar(){
        System.out.println("fim");
    }

    @BeforeAll
    public static void antesDeTodos(){
        System.out.println("ANTES DE TODOS");
    }

    @AfterAll
    public static void depoisDeTodos(){
        System.out.println("DEPOIS DE TODOS");
    }


    @Test
    @DisplayName("Desempenho A desejar reajuste de 3% do salario")
    public void desempenhoAdesejarReajuste3PorCentoDoSalario() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Desempenho bom reajuste de 15% do salario")
    public void desempenhoBomReajuste15PorCentoDoSalario() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Desempenho Otimo reajuste de 20% do salario")
    public void desempenhoOtimoReajuste20PorCentoDoSalario() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }


}
