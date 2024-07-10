package org.example.firststeps

fun main(){
    val exp = 5 + 4 - 3 * 2 * (1 + 1) /3

 // 5 + 4 - 3 * 2 * /3    -> A ordem para resolver a expressão é parentes primeiro depois multiplicação e Divisão
 // 5 + 4 - 6 * 2 / 3     e divisão o que vier antes
 // 5 + 4 - 12 / 3
 // 9 - 4
 // 5
    println(exp)

 // -------------- Expressão lógica

    val exp2 = true && false || true && !false   // Sempre se resolve primeiro o not depois o and e por último or
                                                 // parentese rouba a precedência
    // true && false || true && !false
    // true && false || true && true
    // true && false || true
    // false || true
    // true


    println(exp2)
}