package br.com.kotlin.basics.session05._0504

interface Veiculo {
    val automakerName: String
    fun start(){
        println("Vrummm")
    }
    fun stop(){
        println("Stop noise")
    }
    fun getKmPerLiter(): Int{
        return 17
    }
    fun getDoors(): Int

}