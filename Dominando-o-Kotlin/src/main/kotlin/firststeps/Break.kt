package org.example.firststeps
/*
break tira do loop
 */

fun main(){
    println()
    println("Com o break")
    for (i in 0..50){
        if ( i == 20){
            break
        }
        print("$i ")
    }
        println("Fim")

    println()
    println("Sem o break")
    for (i in 0..50){

        print("$i ")
    }
    println("Fim")
}