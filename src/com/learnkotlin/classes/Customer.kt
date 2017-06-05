package com.learnkotlin.classes

/**
 * Created by rajiv on 30/05/17.
 */

//Class with arguments
class Customer(val id: Int, var name: String) {
    var email = ""

    //Init function which is called first
    init {
        name = name.toUpperCase()
    }

    //Secondary constructor
    constructor(email: String) : this(0, "") {
        this.email = email
    }
}

fun main(args: Array<String>) {
    //Calling through default constructor
    val customer = Customer(10, "Kotlin")
    customer.name
    customer.id
    println(customer.name)
    //Calling through secondary constructor
    val customer1 = Customer("gmail")
    print(customer1.email)
}