package org.example.firststeps

fun main(){
    val i1 = 10
    val d1 = i1.toDouble()  //Convertendo de Int para Double
    println(d1)

    val l1 = i1.toLong()
    println(l1)

    val d2 = 11.34
    val i2 = d2.toInt()
    println(i2)

    val i3 = 2000 //Conversão fora de parametro de Int para byte nesse caso vai ter uma
    val b1 = i3.toByte() // resposta desconexa, pois um Int não cabe no Byte
    println(b1)

}