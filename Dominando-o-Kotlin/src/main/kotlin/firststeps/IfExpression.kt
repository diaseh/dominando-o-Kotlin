package org.example.firststeps

fun main(){
    val numero = 10

    val resultado: String

    if (numero % 2 == 0){
        resultado = "Par"
    } else {
        resultado = "Ímpar"
    }

    println("Simplificando e Usando o If como expressão")

    val numeroE = 10

    val resultadoE = if (numero % 2 == 0) {          //Atribui diretamente o if a variavel
        println("Par r1")  // Somente pode usar esse recurso se tiver o resultado do mesmo tipo
        "Par r2"
    } else {    //Se eu não tivesse o else não funcionaria qdo se usa if como expressão sempre
        println("Ímpar r2")      // tem que ter uma resposta
        "Ímpar r2"
    }
    println(resultadoE)
}