package com.onebank.wendellima

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) { //herda Pessoa
    protected abstract fun calculoAuxilio(): Double //o protected faz com que apenas a classe funcionario e as filhas consigam fazer uso do membro

    override fun toString(): String = """
        Nome:    $nome
        CPF:     $cpf
        Salário: $salario
        Auxílio: ${calculoAuxilio()}
     
    """.trimIndent()
}