package org.example.firststeps.exercicios
/*
Exercícios
Crie um programa que arredonda um valor decimal informado pelo usuário e mostra a resposta na tela.
O arredondamento pode ser feito truncado as casas decimais.
 */
fun main(){
    print("Digite um valor com casa decimal: ")
    val valorDecimal = readln().toDouble()
    println()
    print("O valor com casa decimal é $valorDecimal e o valor sem casa decimal é ${valorDecimal.toInt()}")
    println()
    println("Uma outra forma de resposta concisa")
    print("Digite um valor com casa decimal: ")
    print(readln().toDouble().toInt())
}
