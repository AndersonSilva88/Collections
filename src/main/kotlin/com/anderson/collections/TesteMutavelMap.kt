package com.anderson.collections

fun main() {
    val joel = Funcionario("joel", 2000.0, "CLT")
    val elen = Funcionario("Elen", 1500.0, "PJ")
    val rouge = Funcionario("Rouge", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joel.nome, joel)
    repositorio.create(elen.nome, elen)
    repositorio.create(rouge.nome, rouge)

    println(repositorio.findById(joel.nome))

    println("-----------------------------")
    repositorio.findAll().forEach { println(it) }

    println("-----------------------------")
    repositorio.remove(rouge.nome)
    repositorio.findAll().forEach { println(it) }

}