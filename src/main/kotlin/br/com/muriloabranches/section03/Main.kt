package br.com.muriloabranches.section03

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "Kotlin World"
    println("Hello, $name!!!")
}