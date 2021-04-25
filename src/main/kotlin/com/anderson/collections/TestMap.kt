package com.anderson.collections

fun main() {
  val pair: Pair<String, Double> = Pair("Joel", 1000.0)
  val map1= mapOf(pair)

  map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Elen" to 1500.0,
        "Rouge" to 4000.0
    )
    map2.forEach { k, v -> println("Chave: $k - Valor $v") }

}