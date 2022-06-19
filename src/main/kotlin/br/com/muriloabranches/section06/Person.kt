package br.com.muriloabranches.section06

class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName)

}