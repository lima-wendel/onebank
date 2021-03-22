package com.onebank.wendellima

import java.math.BigDecimal

class Analista(
    nome:String,
    cpf:String,
    salario:BigDecimal
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() {salario * 0,1
        TODO("Not yet implemented")
    }
}