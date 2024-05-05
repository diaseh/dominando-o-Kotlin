package org.example.firststeps

//Unsigned é referente numeros inteiros sem sinal, são somente positivos
/* Tipos de números inteiros do Kotlin
    Correspondente Unsigned associado pelo tipo
    Byte -> UByte
    Short -> UShort
    Int -> UInt
    Long -> Ulong
    ** Pode ser tanto U ou u
 */
fun main(){
    val x = 100U
    val y = 200UL
    val z = 300

    val x2 = x.toInt()
    val y2 = y.toDouble()
    val z2 = z.toUInt()

    val x3 = -20
    val x4 = x3.toInt()
    println(x4) // Vai dar um resultado desconexo, pois convertese valor em (-) em positivo para
                // Unsigned tem que ser positivo para conversão

}