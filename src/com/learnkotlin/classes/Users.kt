package com.learnkotlin.classes

import java.util.*

/**
 * Created by rajiv on 30/05/17.
 */

class Users(val id: Int, var name: String, val yearOfBirth: Int) {

    //Getter Method
    val age: Int get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    //Setter Method
    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security number starts with SN")
            }
            // This "field" is a keyword to assign the value the variable
            field = value
        }

    fun userAsString() :String{
        return "Id:$id,Name:$name"
    }

}

fun main(args: Array<String>) {
    val users = Users(1, "Rajiv", 1988)

    println(users.id)
    println(users.name)
    println(users.age) // Age from get method

    users.socialSecurityNumber = "SN1234" // set the socialSecurity number.

    println(users.userAsString())
}