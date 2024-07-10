package org.example.firststeps.exercicios

/*
Exercício

Escreva um programa que, com base em uma idade fornecida, classifica nos grupos abaixo:
- Criança 0 a 12 anos
- Adolescente: 13 a 17 anos
- Adulto: 18 a 65 anos
- Sênior: 65 anos ou mais
 */
fun main() {
    val crianca = "Criança"
    val yearCrianca = 12
    val adolecente = "Adolecente"
    val yearAdolescente = 17
    val adulto = "Adulto"
    val yearAdulto = 65
    val senior = "Sênior"
    val yearSenior = 120

    val pergunta = print("Digite a sua Idade para Saber a Classificação:")
    val idade = readln().toInt()

    if (idade <=-1) {
        println("Idade sem Classificação")
    } else if (idade <= yearCrianca) {
        println("Você é ${crianca}")
    } else if (idade <= yearAdolescente) {
        println("Você é um ${adolecente}")
    } else if (idade <= yearAdulto) {
        println("Você é um ${adulto}")
    } else if (idade <= yearSenior) {
        println("Você é um ${senior}")
    } else println("Idade sem Classificação")
}