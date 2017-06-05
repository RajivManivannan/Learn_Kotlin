package com.learnkotlin.basic

/**
 * Created by rajiv on 25/05/17.
 */
fun main(args: Array<String>) {

    /**
     * Declaring Variable in Kotlin
     * Syntax: var <variableName>: Datatype = <value>
     */
    var streetName: String = "New street"
    var streetNumber: Int

    //Since kotlin supports Type Inference we can declare var without mentioning Datatype
    var name = "Kotlin"

    /**
     * Declaring constant value
     * Syntax: val <variableName> = value
     */

    val pi = 3.14 // This value is constant (immutable)


    //DataTypes

    val myInt = 10 // Integer
    val myLong = 10L // Long
    val myFloat = 10F // Float
    val myHex = 0x0F // Hex
    val myBinary = 0xb01 // Binary

    val myLongFromInt: Long = myInt.toLong() //Cast Int to Long

    //String

    val myChar = 'R'
    val myString = "my string"
    val escapCharacter = "New line \n"

    val concatString = "Kotlin" +
            "is" + "awesome"

    val multipleLines = """
             Kotlin is awesome
             Again I am telling...
             Kotlin is awesome
             """
    val  language = "kotlin"
    val  length = "Length of the language variable is ${language.length}"

}