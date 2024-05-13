package org.example.firststeps
/*
Sempre que tiver uma operação aritimética entre um Double e um Int o resultado será do tipo
mais abrangente, ou seja, Double.
 */
fun main(){
    println(10/3)

    val a = 10
    val b = 3

    println("Divisão de inteiros ${a/b}") // a divisão foi feita por números inteiros,
                // mas se eu declarar como double aí considera-se as cassa decimal.
    val c = 10.0  // Quando coloco a casa decimal automaticamente o Kotlin já entende que é Double
    val d = 3.0

    println("Divisão por números Double ${c/d}")
    println("Divisão por números Double com outro tipo de transformação ${c/(d).toDouble()}")


}