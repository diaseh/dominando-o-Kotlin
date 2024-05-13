package org.example.firststeps

fun main() {
    // Tabela verdade

    //AND = E
    println("T AND T ${true && true}")
    println("T AND F ${true && false}")
    println("F AND T ${false && true}")
    println("F AND F ${false && false}")

    println()
    //OR = OU
    println("T AND T ${true || true}")
    println("T AND F ${true || false}")
    println("F AND T ${false || true}")
    println("F AND F ${false || false}")

    println()
    //NOT = OU
    println("NOT F ${!false}")
    println("NOT T ${!true}")

}