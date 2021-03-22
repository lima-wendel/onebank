package com.onebank.wendellima

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) { //herda Pessoa
    protected abstract fun calculoAuxilio(); //o protected faz com que apenas a classe funcionario e as filhas consigam fazer uso do membro
}