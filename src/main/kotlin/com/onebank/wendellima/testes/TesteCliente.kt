package com.onebank.wendellima.testes

import com.onebank.wendellima.Cliente
import com.onebank.wendellima.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf  = "123.123.123-00",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"

    )

    println(jose)
    TesteAutenticacao().autentica(jose)
}