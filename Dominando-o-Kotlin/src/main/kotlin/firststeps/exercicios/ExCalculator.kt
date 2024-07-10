package org.example.firststeps.exercicios

private val s = "Qual a operação : "

/*
Exercício
Implementar uma calculadora capaz de executar as 4 operações básicas e recebe os dados via teclado.
Três informações devem ser passadas: o primeiro operando, a operação matemática e o segundo operando
Por exemplo:
> 20
> +
> 4'
> Resultado: 24
 */
fun main () {

    print(">")
    val resposta1 = readln().toDouble()

    print("Qual a operação : ")
    val operacao = readln()[0]  // quando coloca [] chaves declaro como char e valor dentro da chave o caracter que quero

    print(">")
    val resposta2 = readln().toDouble()

    val resultado = when (operacao) {
        '+'-> resposta1 + resposta2
        '-'-> resposta1 - resposta2
        '/'-> resposta1 / resposta2
        '*'-> resposta1 * resposta2
        else -> 0
    }
    print(resultado)



}

