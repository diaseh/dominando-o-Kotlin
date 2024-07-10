package org.example.firststeps
// Quando o if tem apenas uma condição posso omitir as chaves
fun main(){
    val temp = 30
    if (temp > 22) {
        println("Está Calor com Chaves")
    }
    println("Fim do Programa com Chaves")
    println()

// Omitindo as chaves
    if (temp > 22) println("Está Calor s/ Chaves")
    println("Fim do Programa S/ Chaves")
    println()
// Omitindo as chaves com 2 println
    if (temp > 22)
    println("Fim do Programa S/ Chaves  c/ 2 println") // Foi omitido esse println
    println("A Temperatura é ${temp} c/ 2 println") // Só lê o segundo o primeiro é omitido.
    println()
// Com as chaves com 2 println
    if (temp > 22) {
        println("Fim do Programa S/ Chaves  c/ 2 println e chaves") // Com as chaves deixa de ser omitido esse println
        println("A Temperatura é ${temp} c/ 2 println e chaves") // Com as chaves deixa de ser omitido.
    }
}