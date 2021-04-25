package com.anderson.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("--------------------------")
    println("Maior salario:  ${salarios.max()}")
    println("Menor salario:  ${salarios.min()}")
    println("Media salarios:  ${salarios.average()}")

    val salariosMariosque2500 = salarios.filter { it > 2500.0 }
    println("----------------------")
    salariosMariosque2500.forEach { println(it) }
}