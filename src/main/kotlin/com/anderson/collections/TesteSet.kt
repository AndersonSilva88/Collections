package com.anderson.collections

fun main() {
    val joel = Funcionario("joel", 2000.0, "CLT")
    val elen = Funcionario("Elem", 1500.0, "PJ")
    val rouge = Funcionario("Rouge", 4000.0, "CLT")

    val funcionario1 = setOf(joel, elen)
    val funcionario2 = setOf(rouge)

    val resulUnion = funcionario1.union(funcionario2)
    resulUnion.forEach { println(it) }

    println("-------------------------------")
    val funcionario3 = setOf(joel, elen, rouge)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("--------------------------------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }

}