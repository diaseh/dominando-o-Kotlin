package org.example.firststeps

fun main(){
    print("Digite um número: ")
    val resposta = readln().toInt()

    when(resposta) {
        10 -> println("O valor digitado é Dez")
        20 -> println("O valor digitado é Vinte")
        30 -> println("O valor digitado é Trinta")
        else -> println("O valor digitado deve ser: 10, 20 ou 30 t+...")
    }

    println("Usando com valores para ser intercaldo")

    print("Digite um número: ")
    val respostaI = readln().toInt()

    when(respostaI) {
        in 40 .. 50 -> println("O valor digitado está entre 40 a 50")
        in 51 .. 60 -> println("O valor digitado está entre 51 a 60")
        in 61 .. 70 -> println ("O valor digitado está entre 61 a 70")
        else -> println("O valor digitado está em outro intervalo")
    }
    println("Usando vários valores ao mesmo tempo")

    print("Digite um valor entre 0 a 6: ")
    val respostaV = readln().toInt()
    when(respostaV){
        0, 2, 4, 6 -> println("Par")
        else -> println("Não pertence a série 0, 2, 4, 6")
    }
}