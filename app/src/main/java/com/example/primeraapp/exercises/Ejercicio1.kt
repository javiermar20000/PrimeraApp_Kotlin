package com.example.primeraapp.exercises

/**
 * Por lo general Android te ofrece un resumen de las notificaciones
 * Escribe un programa que imprima el mensaje de resumen segun la cantidad
 * de notificaciones que recibiste. El mensaje debe incluir lo siguiente:
 *
 * Objetivos:
 * - La cantidad exacta de notificaciones cuando haya menos de 100
 * - 99+ como cantidad de notificaciones cuando haya 100 o más
 *
 * Resultados:
 * - Tu telefono tiene 51 notificaciones
 * - Tienes 99+ notificaciones
 */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages > 99) {
        println("Usted tiene 99+ notificaciones")
    } else {
        println("Usted tiene $numberOfMessages notificaciones")
    }
}