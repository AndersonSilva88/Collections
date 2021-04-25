package com.anderson.collections

fun main() {
    val joel = Funcionario("joel", 2000.0, "CLT")
    val elen = Funcionario("Elem", 1500.0, "PJ")
    val rouge = Funcionario("Rouge", 4000.0, "CLT")

    val funcionario = mutableListOf(joel, rouge)
    funcionario.forEach { println(it) }

    println("-------------------------------")
    funcionario.add(elen)
    funcionario.forEach { println(it) }

    println("-------------------------------")
    funcionario.remove(rouge)
    funcionario.forEach { println(it) }

    println("------------ SET ----------------")
    val funcionarioSet = mutableSetOf(rouge)
    funcionarioSet.forEach { println(it) }

    println("---------------------------------")

    funcionarioSet.add(elen)
    funcionarioSet.add(joel)
    funcionarioSet.forEach { println(it) }

    println("---------------------------------")
    funcionarioSet.remove(elen)
    funcionarioSet.forEach { println(it) }
}