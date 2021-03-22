package com.onebank.wendellima.testes

import com.onebank.wendellima.Banco

fun main(){
    val oneBank = Banco( nome = "OneBank", numero = 12)

    println(oneBank.nome)
    println(oneBank.numero)

}