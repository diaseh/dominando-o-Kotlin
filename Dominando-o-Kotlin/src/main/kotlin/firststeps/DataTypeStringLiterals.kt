package org.example.firststeps
/*
       O "/n" quebra uma linha dentro da variável.
  Aspas duplas serve para delimitar as strings
  A "\" barra invertida é um caracter de escape.
  */
fun main(){
    /*
    O rato roeu
    a roupa do  -> Se eu quiser colocar " a $roupa do      o $ é um caracter especial coloca o \ para desconsiderar
    rei de "Roma".
     */

    val s1 = "O rato roeu\naroupa do \nrei de \"Roma\"."
    println(s1)
    val s2 = "O rato roeu\na \$roupa do \nrei de \"Roma\"."
    println(s2)

}