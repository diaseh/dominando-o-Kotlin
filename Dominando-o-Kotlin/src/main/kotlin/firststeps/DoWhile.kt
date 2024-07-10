package org.example.firststeps

fun main(){

    var valor = 10

    while (valor <5) {
        print("$valor")  // Aqui como ele executa a rotina primeiro não aparece nenhum valor.
    }

    do {
        print("$valor ") // O Do ele mostra primeiro o valor depois executa a rotina, contrário do while
    } while (valor <5)

}