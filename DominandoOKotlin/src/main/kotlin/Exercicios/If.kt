package selection.Exercicios

val x = 0
fun if(x){
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
