package org.example.firststeps

fun main(){
    val pergunta = print("Digite um Valor: ")
    val valor = readln().toInt()

    if(valor > 0) {
        println("Positivo")
    } else if (valor < 0) {
        println("Negativo")
    } else {
        println("Neutro")
        }

}