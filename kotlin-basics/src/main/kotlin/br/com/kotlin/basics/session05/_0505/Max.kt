package br.com.kotlin.basics.session05._0505

fun <T: Comparable<T>> max(param1: T, param2: T) : T { // T: Comparable<T> restringe a função aos tipos comparabels
    val result =param1.compareTo(param2)
    return if (result>0) param1 else param2

}