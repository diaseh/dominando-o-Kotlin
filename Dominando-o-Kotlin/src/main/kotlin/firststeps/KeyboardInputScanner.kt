package org.example.firststeps

import java.util.Scanner

/* Fazendo uma conversando de dados que nem sempre pode ser string
O redln() sempre retorna uma string
Aqui utilizaremos o scanner que é uma classe que vem do java
Aqui também utilizaremos o System.in que também vem do java e utilizaremos como entrada de dados.
O nextInt extrai o valor e transforma em inteiro
 */
fun main(){
    print("Digite um Valor: ")
    val n1 = readln().toInt()

    println("Digite segundo Valor: ")
    val n2 = readln().toInt()

    println("Resultado: ${n1+n2}")
    println()
    println("Opção 2")

    val scanner = Scanner(System.`in`)
    print("Digite um Valor: ")
    val n3 = scanner.nextInt()
    print("Digite segundo Valor: ")
    val n4 = scanner.nextInt()
    println("Resultado: ${n3+n4}")
}