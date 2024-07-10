package org.example.firststeps

fun main() {
    val pergunta = print("Digite um número: ")
    val resposta = readln().toInt()

    val analise = when {
        resposta > 0 -> "Positivo"
        resposta < 0 -> "Negativo"
        else -> "Zero"
    }
    println(analise)
    println("Jogando a expressão dentro do PrintLn")

    val perguntaP = print("Digite um número: ")
    val respostaP = readln().toInt()

    println(
        when {
            respostaP > 0 -> "Positivo P"
            respostaP < 0 -> "Negativo P"
            else -> "Zero"
        }
    )
    println()
    println("Outra forma fazendo Teste")

    val perguntaT = print("Digite uma letra para obter um valor: ainda em análise ")
    val respostaT = 'A'

    when (respostaT){
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }

    val v = when (respostaT){  // Posso colocar o when em uma variável
        'A', 'a' -> 4
        'B', 'b' -> 5
        else -> 6
    }
    println(v)
}