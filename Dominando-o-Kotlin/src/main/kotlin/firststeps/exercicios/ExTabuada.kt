package org.example.firststeps.exercicios
/*
Exercício
Imprima na tela a tabuada de um número de 1 a 10. U número deve ser fornecido pelo usuário
 */

fun main(){

    print("Digite o valor que deseja a Tabuada: ")
    var resposta = readln().toInt()
    var fator = 0

    print("Até qual valo que gostaria que a Tabuada fosse: ")
    var valmaximo = readln().toInt()


     while (fator <= valmaximo){
         println("$resposta X $fator = ${resposta*fator++}")

    }

}

