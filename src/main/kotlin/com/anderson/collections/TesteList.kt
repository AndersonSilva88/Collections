package com.anderson.collections

fun main() {
    val joel = Funcionario("joel", 2000.0, "CLT")
    val elen = Funcionario("Elem", 1500.0, "PJ")
    val rouge = Funcionario("Rouge", 4000.0, "CLT")

    val funcionarios = listOf(joel, elen, rouge)

    funcionarios.forEach { println(it) }

    println("----------------------------")
    println(funcionarios.findLast { it.nome == "Rouge" })

    println("----------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

     println("---------------------------")
     funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
    }


