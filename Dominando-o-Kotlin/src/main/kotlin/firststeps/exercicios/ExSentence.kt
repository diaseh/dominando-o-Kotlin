package org.example.firststeps.exercicios

import java.util.Scanner

/*
Exercício
 - Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha
 essas informações (use string templates para montar a frase.
 Quando utilizado o readln é para guardar o que o suário digita com string numa variável.
 */
fun main(){
    val scanner = Scanner(System.`in`)
    print("Bom dia")
    print("Digite seu nome: ")
    val nome = readln()
    print("Digite sua idade: ")
    val idade = scanner.nextInt()
    print("Digite seu Peso: ")
    val peso = readln().toDouble()
    println("Bom dia, Você é $nome e tem a idade de $idade anos, com o peso de $peso Kg. Sua idade multiplicado pelo seu peso é " +
            "${idade*peso}")
}