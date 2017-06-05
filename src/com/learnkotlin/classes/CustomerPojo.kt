package com.learnkotlin.classes

/**
 * Created by rajiv on 02/06/17.
 */

/**
 * Data modifier: If we add this keyword before the class keyword
 * We can get by default the following methods implemented: equals object, toString and has
 */
data class CustomerPojo(var id:Int,var name:String){

}

fun main(args: Array<String>) {

    val customer1 = CustomerPojo(1,"kotlin")
    val customer2 = CustomerPojo(2,"java")

    val customer3 = customer1
    //Equals
    if(customer1 == customer3){
        println("They are same")
    }
    //Copy
    val customer4 = customer1.copy(id=4)
    println(customer4)

    //to String
    println(customer1)
}