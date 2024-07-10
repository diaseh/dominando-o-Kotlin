package org.example.firststeps

fun main(){
    print("Digite o valor Positivo, Negativo ou Zero: ")
    val resposta = readln().toInt()

    when{
        resposta > 0 -> println("O Valor é Positivo")
        resposta < 0 -> println("O Valor é Negativo")
        else -> println("O Valor é Zero")
    }
}