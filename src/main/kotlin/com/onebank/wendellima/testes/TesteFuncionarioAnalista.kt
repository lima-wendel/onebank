package com.onebank.wendellima.testes

/**
 * Classe [TesteFuncionarioAnalista] que implementa as operações de [Analista]
 */
import com.onebank.wendellima.Analista

fun main() {
    val joao = Analista("João Pedro", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}