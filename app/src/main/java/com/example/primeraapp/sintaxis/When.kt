package com.example.primeraapp.sintaxis

fun main() {
    getMonth(13)
    getSemester(7)
    getTrimester(8)
    result(true)
    result("Buenos dias")
    result(12)
}

fun getMonth(month:Int) {
    //Para evitar usar muchos if-else se recomienda usar when owo
    when(month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        //En caso de querer una alternativa con mas codigo
        /* 12 -> {

            println("El mes seleccionado es:")
            println("Diciembre")
        } */
        else -> println("Este no es un mes válido uwu")
    }
}

fun getSemester(month:Int) {
    when(month) {
        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Segundo Semestre")
        !in 1..12 -> println("Semestre No válido")
    }
}

//funcion getSemester mas optimizado

fun getSemester2(month:Int) = when(month) {
    in 1..6 -> "Primer Semestre"
    in 7..12 -> "Segundo Semestre"
    !in 1..12 -> "Semestre No válido"
    else -> "Nada"
}

fun getTrimester(month:Int) {
    when(month) {
        1,2,3 -> println("Primer Semestre")
        4,5,6 -> println("Segundo Trimestre")
        7,8,9 -> println("Tercer Trimestre")
        10,11,12 -> println("Cuarto Trimestre")
    }
}

fun result(value:Any) {
    when(value) {
        is Int -> {
            value + value
            println(value+value)
        }
        is String -> println(value)
        is Boolean -> if(value) println("Este es un booleano")
    }
}