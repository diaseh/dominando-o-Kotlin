package org.example.firststeps
//Char representa apenas 1 caracter não pode ser mais apenas 1 caracter pode ser letra numero
fun main(){
    val c: Char = 'A'
    println(c)
    println(c.code) // Retorna o código do caracter da tabela

    val i = 65
    println(i.toChar())

    val c2 = '1'
    println(c2.inc())
    println()
    println(c2.inc().inc()) // o".inc" incrementa um número, quando incrementado 2 vezes o "A" vira 3 rep B
    println()
    println(c2.isDigit()) // Verifica se o caracter é ou não dígito retorna true, ou false
    println()
    val d1 = 'A'
    println(d1.isDigit())
    println("Verifica Letra Maiúscula")
    println(d1.isUpperCase()) // Verifica se a letra é maíuscula ou não
    val e1 = '1'
    println(e1.digitToInt()) // Extrai do CHAR para o valor inteiro

}