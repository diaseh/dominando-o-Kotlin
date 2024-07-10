package org.example.firststeps.exercicios

/*
Exercício
Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou ímpar.
 */

fun main(){
    var pergunta = print("Dígite um Valor: ")
    var numero = readln().toInt()

    if((numero % 2) == 0){
        println("O Valor digitado é Par")
    }else println("O Valor digitado é Ímpar")

    println("Outra Forma")
    val type : String


    print("Digite um Valor: ")
    var entrada = readln().toInt()
    if (entrada % 2 == 0){
        type = "Par"
    }else type = "Ímpar"

    println(type)
}