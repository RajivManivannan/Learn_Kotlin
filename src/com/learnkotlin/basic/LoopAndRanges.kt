package com.learnkotlin.basic

/**
 * Created by Rajiv on 25/05/17.
 */

fun main(args: Array<String>) {

    //For Loop

    // Loop from 1 to 10 and print values.
    for (i in 1..10) {
        println(i)
    }

    // .. is Range operator.
    val numbers = 1..10 // it hold the value of range 1 to 10.
    for (i in numbers) {
        println(i)
    }

    // downTo will provide the value in reverse from 10 to 1.
    for (i in 10 downTo 1) {
        println(i)
    }

    // Same range operator also will do the reverse action
    for (i in 10..1) {
        println(i)
    }

    // step operator will jump with step value while looping
    // o/p will be: 10 8 6 4 2
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    //Looping over list.
    val capitals = listOf("London", "Paris", "Rome")
    for (capital in capitals) {
        println(capital)
    }

    // While Loop
    var i = 10
    while (i > 0) {
        i--
        print(i)
    }

    //Do while loop
    do{
        var x =10
        x--
        print(x)
    }while (x>10)

    //Name the loop with loop@ and do the break and continue operation
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@loop // break the loop
               // continue // continue the loop
            }
        }
    }

}