package com.example.primeraapp.sintaxis

fun main() {
    println("Lista inmutable: ")
    inmutableList()
    println("Lista mutable: ")
    mutableList()
}

fun inmutableList() {
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(readOnly.size) // -> Imprimir tamaño de la lista
    println(readOnly) // -> Imprimir toda la lista
    println(readOnly[3]) // -> Imprimir la posición 3 (Jueves)

    //imprimir el ultimo valor dentro de la lista
    println(readOnly.last())

    //imprimir el primer valor dentro de la lista
    println(readOnly.first())

    //Buscar y imprimir los dias que contengan la letra a con filter
    val example = readOnly.filter { it.contains("a") }
    println("Todos los días que tengan la letra a")
    println(example)

    //Iterar
    readOnly.forEach {weekday -> println(weekday)}
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    weekDays.add("JavierMartínez") // Añadimos un nuevo elemento a la Lista al final
    weekDays.add(0,"Primero") // Añadimos un nuevo elemento al principio de la lista
    println(weekDays)

    if(weekDays.isNotEmpty()) {
        weekDays.forEach{println(it)}
    }
}