package com.onebank.wendellima.testes

import com.onebank.wendellima.Pessoa

fun main()  {
    val wendel = Pessoa() //variável que recebe a instância de uma pessoa... Pessoa() é um objeto

    println(wendel.nome)
    println(wendel.pessoaInfo())
}