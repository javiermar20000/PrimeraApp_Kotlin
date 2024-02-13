package com.example.primeraapp.sintaxis

// VARIABLES

/**
 * Variables Numericas
 */

val age:Int = 30
var age2:Int = 30

fun main(){

    //Llamamos a las funciones creadas en el main
    add(23,40)
    restar(40,30)
    val concatenarString = variablesString("Hola Mundo","xd")
    println(concatenarString)

    //resta aplicada con un return con funcion Int
    val miResta = restar2(50,30)

    //resta sin return, funcion optimizada
    val miResta2 = restar3(55,1)

    //Suma de valores Strings
    val exampleString3:String = "4"
    val exampleString4:String = "8"
    println(exampleString3.toInt()+exampleString4.toInt())


    println(miResta)
    println(miResta2)
    showMyName("Javier Martínez")
    showMyAge(22)
    variablesNumericas()
    variablesBoolean()

    print("Hola Mundo!!!!!!\n")
    val name = "Javier Martínez"
    //Int -2,147,483,647 a 2,147,483,647

    println(age2)
    age2 = 29
    println(age2)

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example:Long = 30

    //Float
    val floatExample:Float = 30.5f

    //Double
    val doubleExample:Double =3241.3123123

    /**
     * Variables Alfanuméricas
     */

    //Char
    val charExample1:Char = 'a'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    //String
    val stringExample:String = "Javiermar2000 Suscribete owo"
    val stringExample2:String = "2"
    val stringExample3:String = "3"

    /**
     * Variables booleanas
     */

    var stringConcatenada:String = "hola"
    stringConcatenada = "hola me llamo $stringExample y tengo $age años"
    println(stringConcatenada)

    println(stringExample)
    println(doubleExample)

    //Concatenar String
    println("Concatenamos los valores 2 y 3:")
    println(stringExample2 + stringExample3)

    //Transformamos string numerico a Int para sumarlos
    println("String numericos a Int con suma de 2 y 3:")
    println(stringExample2.toInt() + stringExample3.toInt())

    var stringExample123:String = age.toString()


}

fun variablesNumericas(){
    // Sumamos valores (variables)
    println("--------------------------")
    println("Sumar:")
    println(age + age2)

    // Restamos valores (variables)
    println("--------------------------")
    println("Restar:")
    println(age - age2)

    // Multiplicamos valores (variables)
    println("--------------------------")
    println("Multiplicar:")
    println(age * age2)

    // División valores (variables)
    println("--------------------------")
    println("Dividir:")
    println(age / age2)

    //Módulo (Resto)
    println("--------------------------")
    println("Módulo:")
    println(age % age2)
}

fun variablesBoolean() {

    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3:Boolean = false

    println(booleanExample)
    println(booleanExample2)

}

fun showMyName(currentName:String){
    println("Hola, me llamo $currentName !")
}

fun showMyAge(currentAge:Int=0){ //al poner el =0 indicamos que siempre habra un valor que mostrar
    println("Mi edad es: $currentAge años!")
}

//Función para sumar dos valores distintos
fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber+secondNumber)
}

//Funcion para restar dos valores distintos
fun restar(firstNumber: Int, secondNumber: Int){
    println(firstNumber-secondNumber)
}

//Uso de return basico
fun restar2(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber-secondNumber
}

//Uso de return optimizado para funciones pequeñitas
fun restar3(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber

//Funcion de variables String concatenadas
fun variablesString(firstString:String, secondString:String):String{
    return firstString+secondString
}
