package org.example.firststeps.exercicios

/*
Exercício
Imprima na tela a tabuada de um número de 1 a 10. O número de ser fornecido pelo usuário.
Utiliza a estrutura de repetição for para resolver o exercício.
 */

fun main(){
    print("Digite um valor para Cálculo do Tabuada: ")
    var resposta = readln().toInt()
    print("Digite um valor que a Tabuada de ir: ")
    var limite = readln().toInt()

    for (indexador in 1 .. limite)
           println( "$resposta x $indexador = ${resposta * indexador}")


}