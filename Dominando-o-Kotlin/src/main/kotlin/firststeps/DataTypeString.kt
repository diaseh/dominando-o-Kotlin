package org.example.firststeps

fun main(){

    val s1 = "abc"
    val s2 = "def"
    val s3 = "ghi"

    val s1s2 = "Soma:" + (s1+s2) //  Em Kotlin strings são imantáveis
                                // Trabalhando com string template avaliado em tempo de execução
    println(s1s2)
    println()
    val s1s2s3 = "Soma: '$s1$s2$s3' O tamanho é: ${(s1+s2+s3).length} " // length é uma propriedade que retorna o tamanho dela
    println(s1s2s3)

}