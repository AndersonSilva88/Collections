package com.anderson.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Anderson"
    nomes[1] = "Larissa"
    nomes[2] = "Davi"
    for (nomes in nomes){
        println(nomes)
    }
    println("----------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------")
    val nomes2 = arrayOf("Luzia", "Cleberson", "Rosane")
    nomes2.sort()
    nomes2.forEach { println(it) }

}
