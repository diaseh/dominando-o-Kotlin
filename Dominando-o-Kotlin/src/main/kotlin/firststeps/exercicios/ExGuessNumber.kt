package org.example.firststeps.exercicios

import kotlin.random.Random

/**
 * Exercício
 * Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório dentro de um
 * intervalo e você deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor
 * que o número tentado.
 * O jogo acaba quando o número tentado for o número correto.
 */

fun main(){
    val numeroMagico = Random.nextInt(0,50)


    println("Qual o número mágico ?")
    val respostaNumeroMagico = readln().toInt()

    if (respostaNumeroMagico == numeroMagico){
        println("Você Acertou o número Secreto")
    } else if (respostaNumeroMagico > numeroMagico){
        println("O número Secreto é Menor")

    } else {
        println("O número Secreto é Maior")
    }
}