package com.onebank.wendellima

abstract class Analista(
    nome:String,
    cpf:String,
    salario:Double
) : Funcionario(nome, cpf, salario) {
    //método a ser implementado para calcular o auxílio de funcionário
    override fun calculoAuxilio(): Double = salario * 0.1

}