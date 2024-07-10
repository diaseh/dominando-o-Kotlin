package org.example.firststeps.exercicios

/*
Exercício

Escreva um programa que recebe um valor numérico pelo teclado, multiplica por ele mesmo e imprime o resultado.
Entretanto, se o valor fornecido for maior que 10, ele deve ser ajustado antes para 10 antes de ser multiplicado.
 */

fun main (){
    val valorAjustado = 10
    print("Digite um valor:")
    val valorDeEntrada = readln().toInt()

    if(valorDeEntrada >= valorAjustado){
        println(10 * valorAjustado)

    } else {
        println(valorDeEntrada * valorDeEntrada)
        println()
    }


    println("Outra Solução")
    print("Digite um valor:")
    var v = readln().toInt()
    if (v > 10) {
        v = 10
    }
    v *= v
    println(v)


}