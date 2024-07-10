package org.example.firststeps
/*
O uso do continue é um Jump, ou seja, ele dá um pulo
 */

fun main(){
    println()
    println("Com o Uso do continue")
    for (i in 1 .. 50){
         if (i % 10 == 0) {    // Aqui o numero que dividir por 10 e sobrar 0 ele vai pular.
             continue
         }
        print("$i ")
    }

    println()
    println("Sem o Uso do continue")
    for (i in 1 .. 50)
        print("$i ")
}