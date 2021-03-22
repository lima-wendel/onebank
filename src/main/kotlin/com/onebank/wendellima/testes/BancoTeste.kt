package com.onebank.wendellima.testes

import com.onebank.wendellima.Banco

fun main(){
    val oneBank = Banco( nome = "OneBank", numero = 12)

    println(oneBank.nome)
    println(oneBank.numero)

    val banco2 = oneBank.copy(nome = "Banco2")

    println(Banco2.info())
}