package com.example.primeraapp.sintaxis

fun main() {
    var name:String = "Javier"
    var name1:String = "Javier"
    var name2:String = "Javier"
    var name3:String = "Javier"
    var name4:String = "Javier"

    //Los arrays tienen posiciones fijas
    val weekDays = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    println("Tamaño del arreglo: ")
    println(weekDays.size)
    println("----------------------------------")
    println("Primer Día de la semana es:")
    println(weekDays[0])
    println("----------------------------------")
    println("Ultimo Día de la semana es:")
    println(weekDays[6])

    //Como crear una excepcion para que no mande error al buscar una posicion
    //del arreglo que no existe?? De esta forma:

    if(weekDays.size >= 8) {
        println(weekDays[7])
    } else {
        println("Esta posicion no existe")
    }

    //Modificar valores de un array
    weekDays[0] = "Holita"
    println(weekDays[0])

    //Bucles para los arrays (si nos interesa la posicion)
    for (position in weekDays.indices) {
        //println("He pasado por aqui $position uwu")
        println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()) { //si nos interesa posición + valor
        println("La posición $position, contiene $value")
    }

    //si nos interesa solamente el valor
    for(weekDay in weekDays) {
        println("Ahora es $weekDay")
    }

}