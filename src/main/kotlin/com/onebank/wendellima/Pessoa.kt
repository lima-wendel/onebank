package com.onebank.wendellima

class Pessoa {
    var nome: String = "Wendel"
    private var cpf: String = "333.444.555-66"
    private set //fica como provate apenas o set, o get fica disponível

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main()  {
    val wendel = Pessoa() //variável que recebe a instância de uma pessoa... Pessoa() é um objeto

    println(wendel.nome)
    println(wendel.pessoaInfo())
}