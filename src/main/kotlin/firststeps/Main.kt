package firststeps

/**
 * Exercicio
 * ------------------
 * Solicite 3 informações ao usuário: nome, idade e pedo. Depois imprima uma frase que contenha essas
 * informações (use string template para montar a frase).
 */
fun main() {
//    print("> ")
//    val n1 = readln().nex
//
//    print("> ")
//    val n2 = readln()
//
//    println("Resultado ${n1 + n2}")

    print("Digite seu nome: ")
    val nome = readln()
    print("Digite sua idade: ")
    val idade = readln()
    print("Digite o seu peso: ")
    val weith = readln().toDouble()

    println("Nome é $nome com idade $idade e com peso de $weith")
}
