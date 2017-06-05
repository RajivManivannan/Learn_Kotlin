package com.learnkotlin.functions

/**
 * Created by rajiv on 30/05/17.
 */

fun main(args: Array<String>) {
    hello()

    //throwException()

    val value = returnsFour()
    println(value)

    val sumResult = sum(5, 6)
    println(sumResult)

    val sunResult = sub(10, 3)
    println(sunResult)

    val addResult = addition(10, 2, 2)
    println(addResult)

    val addResultWithTwoParams = addition(10, 2)
    println(addResultWithTwoParams)

    //passing named parameters
    val userDetail = userDetails("Rajiv", 25, phone = "123456789")
    println(userDetail)

    //Function with unlimited params

    printString("1","2")

    printString("1","2","3")

    printString("1","2","3","4","5","6")
    // --- //

}

/**
 *
 * Function are declared using keyword fun
 *
 * By default return type is Unit, equivalent to void
 *
 * Functions allow
 * 1.Default parameters
 * 2.Named parameters
 * 3.Unlimited Arguments
 *
 * Single expression function don't need  function block.
 */

// This function return void in kotlin unit.
fun hello(): Unit {
    println("Hello Kotlin")
}

//Nothing will always throw exception
fun throwException(): Nothing {
    throw Exception("This function throws an exception")
}

//This function return type is Integer
fun returnsFour(): Int {
    return 4
}

//This function get two input parameter value as Int and return int value
fun sum(x: Int, y: Int): Int {
    return x + y
}

//If we didn't mention the return type it will infer
// the return type from input value.Also we can remove the body braces.
//Simplified form of method.
fun sub(x: Int, y: Int) = x - y

//We can directly assign the default value for the params in the function
//If we are not pass the parameter value
// it will take the default value from the function
fun addition(x: Int, y: Int, z: Int = 2) {
    x + y + z
}

//When we have multiple parameters and assign value to one of the parameter
//to make compiler to know which one I am sending value,
// we can call the value with named parameter
// like this userDetails("Rajiv",25,phone = "123456789")
//we can pass the parameter by changing the position also if the params has data type
fun userDetails(name: String = "N/A", age: Int, email: String = "N/A", phone: String) :String{
    return "name: $name,age: $age,email: $email,phone:$phone"
}

//Function with unlimited parameters using vararg
fun printString(vararg string: String) {
    // while passing the vararg as parameter use the symbol *
    reallyPrintString(*string)
}

fun reallyPrintString(vararg strings: String) {
    for (string in strings) {
        print(string)
    }
}