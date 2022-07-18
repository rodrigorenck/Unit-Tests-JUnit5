package com.rodrigo.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {

    A_DESEJAR{
        @Override
        public BigDecimal getPorcentagemReajuste() {
            return new BigDecimal("0.03");
        }
    },
    BOM{
        @Override
        public BigDecimal getPorcentagemReajuste() {
            return new BigDecimal("0.15");
        }
    },
    OTIMO{
        @Override
        public BigDecimal getPorcentagemReajuste() {
            return new BigDecimal("0.2");
        }
    };


    public abstract BigDecimal getPorcentagemReajuste();

}
