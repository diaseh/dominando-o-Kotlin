package org.example.firststeps.exercicios
/*
Exercício
---------
Encontre o resultado da seguinte expressão:
    (5 + 3 ) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
       8     * 2 < 30 / 2 || !(5 - 1 <=  2   )
       8     * 2 < 30 / 2  || !(   4  <=  2   )
       8     * 2 < 30 / 2  || !(   False   )
       8     * 2 < 30 / 2  || True
          16 < 15 || True
          False || True
             True
*/

fun main (){
    var expression = (5 + 3 ) * 2 < 30/2 || !(5 - 1 <= 8 % 3)
    println(expression)

}