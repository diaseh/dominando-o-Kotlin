package firststeps

/**
 * Exercicio
 * ------------------
 * Solicite 3 informações ao usuário: nome, idade e pedo. Depois imprima uma frase que contenha essas
 * informações (use string template para montar a frase).
 */
fun main() {
    val nome = "Digite seu nome: "
    val idade = "Digite sua idade: "
    val peso = "Digite o seu peso: "

    print(nome)
    val rnome = readln()
    print(idade)
    val ridade = readln()
    print(peso)
    val rpeso = readln()

    println("Nome é $rnome com idade $ridade e com peso de $rpeso")
}
