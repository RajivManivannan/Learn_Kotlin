package com.learnkotlin

import com.learnkotlin.util.someUtility as namedImports

/**
 * Created by Rajiv on 25/05/17.
 */
fun main(args:Array<String>){
    val message = "Hello from Main function"
    println(message)

    //Named imports example check the import of this method
    namedImports("import packages")
}