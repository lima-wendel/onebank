package com.onebank.wendellima.testes

import one.digitalinnovation.digionebank.testes.Gerente

/**
 * Classe [TesteFuncionarioGerente] que implementa as operações de [Gerente]
 */



fun main() {
    val maria = Gerente("Maria do Carmo", "123.365.123-52", 3500.0, "senha123")
    //imprime os dados de Gerente
    ImprimeRelatorioFuncionario.imprime(maria)
    //autentica e verifica as senhas de Gerente
    TesteAutenticacao().autentica(maria)
}
