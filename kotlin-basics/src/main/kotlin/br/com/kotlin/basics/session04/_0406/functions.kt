package br.com.kotlin.basics.session04._0406

fun main() {

    var x = 0

    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do { //vai sempre executar o codigo pelo menos 1 vez; e depois checa a condicao
        println("x = $x")
        x -= 3
    } while (x > 0)

    //a execução é semelhante ao for each do java
    //nao possui a estrutura convencional do java for. Evita lançamento de exceções, "estrutura problematica"
    //internamente o item é um val
    for (item in 1..10) {
        // item++ //não pode
        print("$item, ")
    }

    for (ch in "Erudio"){
        println(ch)
    }
}