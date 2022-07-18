package com.rodrigo.tdd.service;

import com.rodrigo.tdd.modelo.Funcionario;

public class FeriasService {

    public boolean verificaFerias(Funcionario funcionario){
        if(funcionario.getTempoEmpresaMeses()>=12){
            return true;
        }
        return false;
    }


}
