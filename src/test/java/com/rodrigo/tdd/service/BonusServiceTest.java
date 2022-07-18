package com.rodrigo.tdd.service;

import com.rodrigo.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    public void inicializar(){
        this.service = new BonusService();
    }

    @Test
    public void deveriaJogarUmaIllegalArgumentExceptionParaFuncionariosComSalarioAcimaDe10mil(){
        assertThrows(IllegalArgumentException.class, () ->{
            service.calcularBonus(new Funcionario("x", LocalDate.now(), new BigDecimal("10001")));
        });
//        try{
//            service.calcularBonus(new Funcionario("x", LocalDate.now(), new BigDecimal("10001")));
//            fail("Nao deu Exception");
//        }catch (Exception e){
//            assertEquals("Funcionario com salario superior a 10 mil reais nao recebe bonus", e.getMessage());
//        }
    }

    @Test
    public void bonusDeveriaSerDezPorCentoParaSalarioAbaixoDe10mil(){
        BigDecimal bonus = service.calcularBonus(new Funcionario("x", LocalDate.now(), new BigDecimal("1000")));
        assertEquals(new BigDecimal("100.0"), bonus);
    }

    @Test
    public void bonusDeveriaSerDezPorCentoParaSalarioExatamenteIgualA10mil(){
        BigDecimal bonus = service.calcularBonus(new Funcionario("x", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.0"), bonus);
    }

}
