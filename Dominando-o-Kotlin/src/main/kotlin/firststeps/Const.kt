package org.example.firststeps
// Uma variável externa é uma considerada uma top level verable
/*
Quando declaramos uma variável top level e utilizamos const val =
não notamos diferença, porém se as variáveis são conhecidas em tempo de compilação faz o in-line
é sugerido adicionar o modificador const e como se o Kotlin copiasse a constate para dentro da variável
melhorando o processamento. (Quando usado o const nas variáveis in-line no qual o compilador
faz a chamada ele ganha em desempenho quando utilizado o const

 */
fun main(){


    println(msg)
    println(x)
}

const val msg = "Hi!"
const val x = 10