package org.example.firststeps
/*
Com for é possível trabalhar com range de valores de x até y
 */
fun main(){
    for( i  in 0..10){
        print("$i ")
    }
    println()
    for (i in 10 downTo 0 step 1) {   // Conta de 10 até 9 de 2 em 2
        print("$i ")
    }
    println()

    for (i in 10 ..101 step 3 )
        print("$i ")
}