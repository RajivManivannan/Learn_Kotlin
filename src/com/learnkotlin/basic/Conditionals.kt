package com.learnkotlin.basic

/**
 * Created by rajiv on 25/05/17.
 */

fun main(args: Array<String>) {

    var myString = "mine"

    // Get the result of the if/else condition into a val.
    val output = if (myString != "") {
        "Not Empty.."
    } else {
        "Empty"
    }
    println(output)


    //check the result using the "when" and is condition
    val result = "value"
    val whenValue = when (result) {
        "value" -> {
            println("It's a value")
            "first when case"
        }
        is String -> {
            "Yes String"
        }
        else -> {
            "not a string"
        }
    }
    println(whenValue)

}