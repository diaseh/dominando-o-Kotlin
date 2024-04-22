/**
 * Exercicio 2
 * ------------------
 * Crie um programa que arredonda um valor decimal informado pelo usuário e mostra
 * a resposta na tela.
 * O arredondamento pode ser feito truncado as casas decimais
 */

fun main() {
    println("Escreva sua Idade")
    val idade = readln().toInt()
    if (idade <= 12) {
        println("Criança")
    } else if (idade <= 17) {
        println("Adolecente")
    } else if (idade <= 65) {
        println("Adulto")
    } else if (idade <= 120)
    {
        println("Senior")
    } else {
        println("Fora de Classificação")
    }
}

// val exp = !(2 * 4 >= 16 / 2 && 5 == 4+1)
//
// println(exp)
// if (exp == false) {
//    println("Calculo Correto")
// } else {
//    println("Refazer")
// }
// !(2 * 4 >= 16 / 2 && 5 == 4+1)
// !(8 >= 16 / 2 && 5 == 5)
// !( T && T)
//    F

// // Solução 1
// print("Informe um valor decimal para arrendondamento: ")
// val nd = readln().toDouble()
// println("O valor arredondado é ${nd.toInt()}")
//
// // Solução 2
// print("Informe um valor decimal para arrendondamento: ")
// println(readln().toDouble().toInt())
