package org.example.firststeps

fun main(){

//    papa@ for (letra in 'A'..'E'){
//        for (numero in 1 ..5){
//            print("$letra$numero ")
//
//            if (numero == 2)
//                break
//        }
//        println()
//
//    }

    papa@ for (letra in 'A'..'E'){
        for (numero in 1 ..5){
            print("$letra$numero ")

            if (numero == 2)
                //break@papa
                continue@papa
                println()
        }
        println()
    }
    println()


//    for (i in 'A' ..'E') {
//        for (j in 1..5) {
//            print("$i$j ")
//        }
//        println()
//    }
}