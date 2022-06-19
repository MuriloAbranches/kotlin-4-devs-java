package br.com.muriloabranches.section05

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Vruumm")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int

}