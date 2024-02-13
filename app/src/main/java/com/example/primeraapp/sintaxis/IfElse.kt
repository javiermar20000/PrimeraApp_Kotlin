package com.example.primeraapp.sintaxis

fun main() {
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifInt()
    ifMultiple()
    ifMultipleDecision()

}

// Función If Anidado
fun ifAnidado() {
    val animal = "dog"
    /**
     * if(animal == "dog") {
     *         println("Es un perrito!!!!")
     *     } else {
     *         println("No es un perrito")
     *     }
     *
     *     if(animal == "gato") {
     *         println("El animal es un gato!!")
     *     } else {
     *         println("El animal NO es un gato!!")
     *     }
     */
    //Ahora usamos el If-Else anidado para hacerlo mas corto y optimizado
    if(animal == "dog") {
        println("Es un perrito!!!")
    } else if (animal == "gato"){
        println("Es un gatito!!!!!")
    } else if (animal == "bird"){
        println("Es un pajarito!!!")
    } else {
        println("Este animal no es ni un perro, ni un gato ni un pajaro!")
    }

}

// Funcion If-Else básica
fun ifBasico() {
    val name = "Javier"

    if(name == "Angel") {
        println("Oye, la variable name es Javier")
    } else {
        println("La variable name es correcta")
    }
}

//If-Else con Boolean
fun ifBoolean() {
    var soyFeliz:Boolean = true
    if(!soyFeliz){ // sin nada == true | con "!" es == false
        print("Es Falso que es feliz!")
    } else {
        println("Es verdadero que es feliz!!!!!")
    }
}

//Funciones Int con If-Else
fun ifInt() {
    var age = 29

    if (age >= 18) {
        println("Tiene permitido comprar alcohol y cigarrillos")
    } else {
        println("No tiene permitido comprar alcohol y cigarrillos")
    }
}

//If multiple con mas de una condición "&&"
fun ifMultiple() {
    var age = 18
    var parentPermission = true
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy) {
        println("Puede beber alcochol")
    } else {
        println("No puede beber alcohol")
    }
}

//If multiple con or => ||
fun ifMultipleDecision() {
    var age = 18
    var parentPermission = true
    var imHappy = true

    if (age >= 18 || parentPermission || imHappy) {
        println("Puede beber alcochol")
    } else {
        println("No puede beber alcohol")
    }

}

