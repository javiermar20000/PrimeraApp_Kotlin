package com.example.primeraapp.sintaxis

fun main() {
    var name:String? = null
    var name2:String? = "Javier Martínez"

    println(name?.get(3) ?: "Es nulo owo")
    println(name2?.get(0) ?: "Es nulo owo")
}