package org.example.firststeps
/*
Utilizando o readln o Kotlin vai efetuar a leitura do que vai ser digitado no teclado
e armazenar em uma variável.
 */

fun main(){

    println("Digite o seu nome:")
    val name = readln()

    println("Seu nome invertido é: ${name.reversed()}")
}